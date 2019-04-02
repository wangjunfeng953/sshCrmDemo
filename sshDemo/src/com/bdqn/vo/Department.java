package com.bdqn.vo;

import java.util.HashSet;
import java.util.Set;

//部门
public class Department {
	private Integer did;//部门id	
	private String deptName;//部门名称
	private String introduce;//
	//部门号员工的关系
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
