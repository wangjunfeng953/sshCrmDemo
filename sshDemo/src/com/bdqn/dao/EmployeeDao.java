package com.bdqn.dao;

import java.util.List;

import com.bdqn.vo.Employee;

public interface EmployeeDao extends BaseDao<Employee>{
//���¼���Ƿ����
		public Employee findByName(String LoginName);
//��½
		public Employee login(String loginName,String loginPwd);
}
