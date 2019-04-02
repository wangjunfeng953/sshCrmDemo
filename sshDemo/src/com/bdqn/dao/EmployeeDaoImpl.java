package com.bdqn.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bdqn.vo.Employee;

public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao{



	public Employee findByName(String loginName) {
		String hql="from Employee where loginName=?";
		List<Employee> list=this.getHibernateTemplate().find(hql, loginName);
		if(list.size()>0&&list!=null){
			return list.get(0);
		}
		return null;
	}
	public Employee login(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		String hql="from Employee where loginName=? and loginPwd=?";
		List<Employee> list=this.getHibernateTemplate().find(hql, loginName,loginPwd);
		if(list.size()>0&&list!=null){
			return list.get(0);
		}
		return null;
	}
}
