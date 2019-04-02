package com.bdqn.service;

import java.util.List;

import com.bdqn.vo.Employee;
import com.bdqn.vo.Page;

public interface EmployeeService {
	//注册方法
		public void add(Employee emp);
	//验证是否存在注册中账号
		public Employee findByName(String loginName);
	//登陆
		public Employee login(String loginName,String loginPwd);
	//分页
		public Page<Employee> findByPage(int creePage);
		//删除
		public void delete(Employee emp);
		//修改查
		public Employee findById(int eid);
		//修改改
		public void updete(Employee emp);
}
