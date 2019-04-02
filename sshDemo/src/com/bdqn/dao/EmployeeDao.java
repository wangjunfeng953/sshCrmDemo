package com.bdqn.dao;

import java.util.List;

import com.bdqn.vo.Employee;

public interface EmployeeDao extends BaseDao<Employee>{
//查登录名是否存在
		public Employee findByName(String LoginName);
//登陆
		public Employee login(String loginName,String loginPwd);
}
