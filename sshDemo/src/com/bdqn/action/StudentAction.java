package com.bdqn.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.bdqn.service.ClassLieService;
import com.bdqn.service.StudentService;
import com.bdqn.vo.ClassLie;
import com.bdqn.vo.Page;
import com.bdqn.vo.Student;
import com.bdqn.vo.ZiXueStudent;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student>{
	private Student student = new Student();
	private StudentService stuService;
	private ClassLieService cls;
public ClassLieService getCls() {
		return cls;
	}
	public void setCls(ClassLieService cls) {
		this.cls = cls;
	}
public Student getModel() {
	// TODO Auto-generated method stub
	return student;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public StudentService getStuService() {
	return stuService;
}
public void setStuService(StudentService stuService) {
	this.stuService = stuService;
}
Integer creePage = 1;

public Integer getCreePage() {
	return creePage;
}
public void setCreePage(Integer creePage) {
	this.creePage = creePage;
}
public String findzixunByPage(){
	Page<Student> page = stuService.findByPage(creePage);
	push(page);
	return "findzixunByPageSuccess";
}
public String stuUpdateUis(){
	student = stuService.findById(student.getZid());
	push(student);
	List<ClassLie> list = cls.findAll();
	set("list", list);
	return "stuUpdateUiSuccess";
}
public String addZiStudentUi(){
	List<ClassLie> list = cls.findAll();
	set("list", list);
	return "addZiStudentUiSuccess";
}
public String inClassUi(){
	student = stuService.findById(student.getZid());
	push(student);
	List<ClassLie> list = cls.findAll();
	set("list", list);
	return "inClassUiSuccess";
}
public String inClassCG(){
	stuService.inClass(student);
	return "inClassCGSuccess";
}
public String addZiStudent(){
	stuService.add(student);
	return "addZiStudentSuccess";
}
public String deleteZi(){
	stuService.delete(student);
	return "deleteZiSuccess";
}
public String stuUpdate(){
	stuService.update(student);
	return "stuUpdateSuccess";
}
public String queryZiXun(){
	DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
	//1.ѧ������
	if(student.getZiName()!=null&&student.getZiName().trim().length()>0){
		criteria.add(Restrictions.like("ziName", "%"+student.getZiName()+"%"));
	}
	//2.ѧ���Ա�
	if(student.getZisex()!=null&&student.getZisex().trim().length()>0&&!student.getZisex().equals("---��ѡ��----")){
		criteria.add(Restrictions.eq("zisex", student.getZisex()));
	}
	//3.ѧ���绰
	if(student.getZphone()!=null){
		criteria.add(Restrictions.like("zphone", "%"+student.getZphone()+"%"));
	}
	//4.ѧ��qq
	if(student.getZiqq()!=null){
		criteria.add(Restrictions.like("ziqq", "%"+student.getZiqq()+"%"));
	}
	//5.ѧ����ַ
	if(student.getAddtre()!=null&&student.getAddtre().trim().length()>0){
		criteria.add(Restrictions.like("addtre", "%"+student.getAddtre()+"%"));
	}
	//6.ѧ��ѧУ
	if(student.getZishoot()!=null&&student.getZishoot().trim().length()>0){
		criteria.add(Restrictions.like("zishoot", "%"+student.getZishoot()+"%"));
	}
	//7.ѧ������
	if(student.getZiage()!=null){
		criteria.add(Restrictions.eq("ziage", student.getZiage()));
	}
	//8.ѧ��ѧ��
	if(student.getXueli()!=null&&student.getXueli().trim().length()>0){
		criteria.add(Restrictions.like("xueli", "%"+student.getXueli()+"%"));
	}
	//9.ѧ����ע
	if(student.getBeiZhu()!=null&&student.getBeiZhu().trim().length()>0){
		criteria.add(Restrictions.like("beiZhu", "%"+student.getBeiZhu()+"%"));
	}
	//10.ѧ���༶
	if(banji!=null&&banji.trim().length()>0&&!banji.equals("---��ѡ��----")){
		criteria.createAlias("classLie", "cl");
		if(StringUtils.isNotBlank(banji)){
			criteria.add(Restrictions.like("cl.cbName", "%"+banji+"%"));
		}
	}
	System.out.println("ss");
	List<Student> list = stuService.findGaoJi(criteria);
	set("list", list);
	return "queryZiXunSuccess";
}
String banji;
public String getBanji() {
	return banji;
}
public void setBanji(String banji) {
	this.banji = banji;
}

public String gaojiUi(){
	List<ClassLie> list = cls.findAll();
	set("list", list);
	return "gaojiUiSuccess";
}
public void set(String arg0,Object arg1){
	ActionContext.getContext().getValueStack().set(arg0, arg1);
}
public void push(Object obj){
	ActionContext.getContext().getValueStack().push(obj);
}
}
