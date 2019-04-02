package com.bdqn.action;

import com.bdqn.service.DepartmentService;
import com.bdqn.vo.Department;
import com.bdqn.vo.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{
	private Department department = new Department();
	private DepartmentService departmentService;
	
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public Department getModel() {
	// TODO Auto-generated method stub
	return department;
	}
	int creePage=1;
	
	public int getCreePage() {
		return creePage;
	}
	public void setCreePage(int creePage) {
		this.creePage = creePage;
	}
	public String department(){
		Page<Department> page = departmentService.findByPage(creePage);
		push(page);
		return "deptAndPageSuccess";
	}

	/*------------------跳转添加页面----------------------------*/

	public String saveUi(){
		
		return "saveUiSuccess";
	}
	//添加
	public String save(){
		departmentService.add(department);
		return "saveSuccess";
	}
	//删除
	public String delete(){
		System.out.println(department.getDid());
		departmentService.delete(department);
		return "deleteSuccess";
	}
	//修改-回显(查)
	public String updateUi(){
		department = departmentService.findById(department.getDid());
		return "updateUiSuccess";
	}
	//修改-改
	public String update(){
		departmentService.update(department);
		return "updateSuccess";
	}
	/*----------------------------------------------------*/
	public void push(Object obj){
		ActionContext.getContext().getValueStack().push(obj);
	}

}
