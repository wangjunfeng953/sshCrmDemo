package com.bdqn.vo;

import java.util.HashSet;
import java.util.Set;

//����
public class Department {
	private Integer did;//����id	
	private String deptName;//��������
	private String introduce;//
	//���ź�Ա���Ĺ�ϵ
	private Set<Employee> employees= new HashSet<Employee>();
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
}
