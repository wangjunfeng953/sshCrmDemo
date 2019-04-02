package com.bdqn.service;

import java.util.List;

import com.bdqn.vo.Employee;
import com.bdqn.vo.Page;

public interface EmployeeService {
	//ע�᷽��
		public void add(Employee emp);
	//��֤�Ƿ����ע�����˺�
		public Employee findByName(String loginName);
	//��½
		public Employee login(String loginName,String loginPwd);
	//��ҳ
		public Page<Employee> findByPage(int creePage);
		//ɾ��
		public void delete(Employee emp);
		//�޸Ĳ�
		public Employee findById(int eid);
		//�޸ĸ�
		public void updete(Employee emp);
}
