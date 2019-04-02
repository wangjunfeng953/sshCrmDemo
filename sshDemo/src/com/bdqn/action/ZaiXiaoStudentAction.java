package com.bdqn.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.bdqn.service.ClassLieService;
import com.bdqn.service.ZaiXiaoStudentService;
import com.bdqn.vo.ClassLie;
import com.bdqn.vo.Page;
import com.bdqn.vo.ZiXueStudent;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ZaiXiaoStudentAction extends ActionSupport implements ModelDriven<ZiXueStudent>{

	private ZiXueStudent zs = new ZiXueStudent();
	private ZaiXiaoStudentService zaiService;
	private ClassLieService cls;
	
	public ClassLieService getCls() {
		return cls;
	}
	public void setCls(ClassLieService cls) {
		this.cls = cls;
	}
	public ZiXueStudent getModel() {
		// TODO Auto-generated method stub
		return zs;
	}
	public ZiXueStudent getZs() {
		return zs;
	}
	public void setZs(ZiXueStudent zs) {
		this.zs = zs;
	}
	public ZaiXiaoStudentService getZaiService() {
		return zaiService;
	}
	public void setZaiService(ZaiXiaoStudentService zaiService) {
		this.zaiService = zaiService;
	}
Integer creePage = 1;
	public Integer getCreePage() {
	return creePage;
}
public void setCreePage(Integer creePage) {
	this.creePage = creePage;
}

public String inupdateUis(){
	zs = zaiService.findById(zs.getZid());
	List<ClassLie> list = cls.findAll();
	set("list", list);
	return "inupdateUisSuccess";
}

public String inupdateUi(){
	zs = zaiService.findById(zs.getZid());
	List<ClassLie> list = cls.findAll();
	set("list", list);
	return "inupdateUiSuccess";
}
	public String StuPage(){
		Page<ZiXueStudent> page=zaiService.findByPage(creePage);
		push(page);
		return "StuPageSuccess";
	}
	public String queryzai(){
		List<ClassLie> list = cls.findAll();
		set("list", list);
		return "queryzaiSuccess";
	}
	String banji;
	
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	public String queryZaisXiao(){
		DetachedCriteria criteria = DetachedCriteria.forClass(ZiXueStudent.class);
		//1.学生姓名
		if(zs.getZiName()!=null&&zs.getZiName().trim().length()>0){
			criteria.add(Restrictions.like("ziName", "%"+zs.getZiName()+"%"));
		}
		//2.学生性别
		if(zs.getZisex()!=null&&zs.getZisex().trim().length()>0&&!zs.getZisex().equals("---请选择----")){
			criteria.add(Restrictions.eq("zisex", zs.getZisex()));
		}
		//3.学生电话
		if(zs.getZphone()!=null){
			criteria.add(Restrictions.like("zphone", "%"+zs.getZphone()+"%"));
		}
		//4.学生qq
		if(zs.getZiqq()!=null){
			criteria.add(Restrictions.like("ziqq", "%"+zs.getZiqq()+"%"));
		}
		//5.学生地址
		if(zs.getAddtre()!=null&&zs.getAddtre().trim().length()>0){
			criteria.add(Restrictions.like("addtre", "%"+zs.getAddtre()+"%"));
		}
		//6.学生学校
		if(zs.getZishoot()!=null&&zs.getZishoot().trim().length()>0){
			criteria.add(Restrictions.like("zishoot", "%"+zs.getZishoot()+"%"));
		}
		//7.学生年龄
		if(zs.getZiage()!=null){
			criteria.add(Restrictions.eq("ziage", zs.getZiage()));
		}
		//8.学生学历
		if(zs.getXueli()!=null&&zs.getXueli().trim().length()>0){
			criteria.add(Restrictions.like("xueli", "%"+zs.getXueli()+"%"));
		}
		//9.学生备注
		if(zs.getBeiZhu()!=null&&zs.getBeiZhu().trim().length()>0){
			criteria.add(Restrictions.like("beiZhu", "%"+zs.getBeiZhu()+"%"));
		}
		//10.学生班级
		if(banji!=null&&banji.trim().length()>0&&!banji.equals("---请选择----")){
			criteria.createAlias("classLie", "cl");
			if(StringUtils.isNotBlank(banji)){
				criteria.add(Restrictions.like("cl.cbName", "%"+banji+"%"));
			}
		}
		System.out.println("ss");
		List<ZiXueStudent> list = zaiService.findGaoJi(criteria);
		set("list", list);
	 return "queryZaisXiaoSuccess";
	}
	public String updateStu(){
		zaiService.update(zs);
		return "updateStuSuccess";
	}
	public String delete(){
		zaiService.delete(zs);
		return "deleteSuccess";
	}
	public String saveUi(){
		List<ClassLie> list = cls.findAll();
		set("list", list);
		return "saveUiSuccess";
	}
	public String save(){
		zaiService.add(zs);
		return "saveSuccess";
	}
	public void set(String arg0,Object arg1){
		ActionContext.getContext().getValueStack().set(arg0, arg1);
	}
	public void push(Object obj){
		ActionContext.getContext().getValueStack().push(obj);
	}
}
