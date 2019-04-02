package com.bdqn.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bdqn.dao.EmployeeDao;
import com.bdqn.vo.Department;
import com.bdqn.vo.Employee;
import com.bdqn.vo.Page;

@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao empDao;
	
	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void add(Employee emp) {
		// TODO Auto-generated method stub
		empDao.add(emp);
	}
	public Employee findByName(String loginName) {
		// TODO Auto-generated method stub
		return empDao.findByName(loginName);
	}
	public Employee login(String loginName,String loginPwd) {
		// TODO Auto-generated method stub
		return empDao.login(loginName,loginPwd);
	}
	public Page<Employee> findByPage(int creePage) {
		// TODO Auto-generated method stub
		Page<Employee> page=new Page<Employee>();
		//设置当前页
		page.setCreePage(creePage);
		//设置每页显示条数
		page.setPageSize(page.getPageSize());
		//设置总记录数
		int count = empDao.findCount();
		page.setTotaCount(count);
		//求总页数
		int totaPageCount = page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize():page.getTotaCount()/page.getPageSize()+1;
		page.setTotaPage(totaPageCount);
		//设置每页显示内容
		int begin = (page.getCreePage()-1)*page.getPageSize();
		List<Employee> list = empDao.findByPage(begin, page.getPageSize());
		page.setList(list);
		return page;
	}
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		empDao.delete(emp);
	}
	public Employee findById(int eid) {
		// TODO Auto-generated method stub
		return empDao.findById(eid);
	}
	public void updete(Employee emp) {
		// TODO Auto-generated method stub
		empDao.update(emp);
	}


}
