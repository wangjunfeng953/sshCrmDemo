package com.bdqn.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.bdqn.service.DepartmentService;
import com.bdqn.service.EmployeeService;
import com.bdqn.vo.Department;
import com.bdqn.vo.Employee;
import com.bdqn.vo.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	private EmployeeService empService;
	private Employee emp = new Employee();
	private DepartmentService departmentService ;
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public EmployeeService getEmpService() {
		return empService;
	}
	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	}
	public Employee getModel() {
		// TODO Auto-generated method stub
		return emp;
	}
	public String registUI(){
		return "registUiSuccess";
	}
	public String regist(){
		//根据用户名进行查询
				Employee emps = empService.findByName(emp.getLoginName());
				if(emps==null){
					//没查到 可以注册
					empService.add(emp);
					return "registSuccess";
				}else{
					//查到 不可注册
					return "input";
				}
	}
	public String yan() throws IOException{
		//根据用户名进行查询
		Employee emps = empService.findByName(emp.getLoginName());
		if(emps==null){
			//没查到 可以注册
				ServletActionContext.getResponse().getWriter().print(2);
		}else{
			//查到 不可注册
			ServletActionContext.getResponse().getWriter().print(1);
		}
		return NONE;
	}
	String shifou="请输入账号和密码登陆";
	public String getShifou() {
		return shifou;
	}
	public void setShifou(String shifou) {
		this.shifou = shifou;
	}
	public String login(){
		Employee e = empService.login(emp.getLoginName(),emp.getLoginPwd());
		if(e!=null){
			ServletActionContext.getContext().getSession().put("employee", e);
		return  "loginSuccess";
		}else{
			shifou="密码错误";
			push(shifou);
			return "LoginInput";
		}
		}
	int creePage = 1;
	public int getCreePage() {
		return creePage;
	}
	public void setCreePage(int creePage) {
		this.creePage = creePage;
	}
	public String employPage(){
		Page<Employee> page=empService.findByPage(creePage);
		push(page);
		return "empAndPageSuccess";
	}
	public String delete(){
		empService.delete(emp);
		return "deleteSuccess";
	}
	public String updateUi(){
		emp = empService.findById(emp.getEid());
		List<Department> list = departmentService.findAll();
		set("list", list);
		return "updateUiSuccess";
	}
	public String update(){
		empService.updete(emp);
		return "updateSuccess";
	}
	public String saveUi(){
		List<Department> list = departmentService.findAll();
		set("list", list);
		return "saveUiSuccess";
	}
	public String save(){
		empService.add(emp);
		return "saveSuccess";
	}
	private void set(String arg0,Object arg1){
		ActionContext.getContext().getValueStack().set(arg0, arg1);
	}
	private void push(Object obj) {
		// TODO Auto-generated method stub
		ActionContext.getContext().getValueStack().push(obj);
	}
}
