package com.bdqn.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bdqn.dao.DepartmentDao;
import com.bdqn.vo.Department;
import com.bdqn.vo.Page;
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentDao departmentDao;
	
	
public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}


	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}


public Page<Department> findByPage(int creePage) {
	// TODO Auto-generated method stub
	Page<Department> page=new Page<Department>();
	//设置当前页
	page.setCreePage(creePage);
	//设置每页显示条数
	page.setPageSize(page.getPageSize());
	//设置总记录数
	int count = departmentDao.findCount();
	page.setTotaCount(count);
	//求总页数
	int totaPageCount = page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize():page.getTotaCount()/page.getPageSize()+1;
	page.setTotaPage(totaPageCount);
	//设置每页显示内容
	int begin = (page.getCreePage()-1)*page.getPageSize();
	List<Department> list = departmentDao.findByPage(begin, page.getPageSize());
	page.setList(list);
	return page;
}
public void add(Department dept) {
	// TODO Auto-generated method stub
	departmentDao.add(dept);
}
public Department findById(int did) {
	// TODO Auto-generated method stub
	return departmentDao.findById(did);
}
public void update(Department dep) {
	// TODO Auto-generated method stub
	departmentDao.update(dep);
}
public void delete(Department did) {
	// TODO Auto-generated method stub
	departmentDao.delete(did);
}

public List<Department> findAll() {
	// TODO Auto-generated method stub
	return departmentDao.findAll();
}
}
