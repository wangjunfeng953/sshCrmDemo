package com.bdqn.action;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.bdqn.service.CategoryBService;
import com.bdqn.service.ClassLieService;
import com.bdqn.vo.CategoryB;
import com.bdqn.vo.ClassLie;
import com.bdqn.vo.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ClassLieAction extends ActionSupport implements ModelDriven<ClassLie>{
private ClassLie cl = new ClassLie();
private CategoryBService cb;

	public CategoryBService getCb() {
	return cb;
}

public void setCb(CategoryBService cb) {
	this.cb = cb;
}

	public ClassLie getModel() {
		// TODO Auto-generated method stub
		return cl;
	}
	private ClassLieService banService;
	int creePage=1;
	
public ClassLie getCl() {
		return cl;
	}

	public void setCl(ClassLie cl) {
		this.cl = cl;
	}


	public ClassLieService getBanService() {
		return banService;
	}

	public void setBanService(ClassLieService banService) {
		this.banService = banService;
	}

	public int getCreePage() {
		return creePage;
	}

	public void setCreePage(int creePage) {
		this.creePage = creePage;
	}
	public String queryCategoryUi(){
		
		return "queryClassUiSuccess";
	}
	public String delete(){
		banService.delete(cl);
		return "deleteSuccess";
	}
	
	public String update(){
		banService.update(cl);
		return "updateSuccess";
	}
	
	public String addSaveClass(){
		banService.save(cl);
		return "addSaveClassSuccess";
	}
	
	public String addSaveClassUi(){
		List<CategoryB> list = cb.findAll();
		set("list", list);
		return "addSaveClassUiSuccess";
	}
	public String updateUi(){
		cl = banService.findById(cl.getBid());
		List<CategoryB> list = cb.findAll();
		set("list", list);
		return "updateUiSuccess";
	}
	Date intoDayO;
	Date outDayO;
	public Date getIntoDayO() {
		return intoDayO;
	}

	public void setIntoDayO(Date intoDayO) {
		this.intoDayO = intoDayO;
	}

	public Date getOutDayO() {
		return outDayO;
	}

	public void setOutDayO(Date outDayO) {
		this.outDayO = outDayO;
	}

	public String queryClassLie(){
		DetachedCriteria criteria = DetachedCriteria.forClass(ClassLie.class);
		//1.对班级名称模糊查询
			if(cl.getCbName()!=null&&cl.getCbName().trim().length()>0){
				criteria.add(Restrictions.like("cbName", "%"+cl.getCbName()+"%"));
			}
		//2.入学时间
			//.最早
			if(cl.getIntoDay()!=null){
				criteria.add(Restrictions.ge("intoDay", cl.getIntoDay()));
			}
			//.最晚
			if(intoDayO!=null){
				criteria.add(Restrictions.le("intoDay", intoDayO));
			}
		//3.毕业时间
			//.最早
			if(cl.getOutDay()!=null){
				criteria.add(Restrictions.ge("outDay", cl.getOutDay()));
			}
			//.最晚
			if(outDayO!=null){
				criteria.add(Restrictions.le("outDay", outDayO));
			}
		//4.是否入学
			if(cl.getStatZ()!=null){
				criteria.add(Restrictions.like("statZ", cl.getStatZ()));
			}
		//5.班级人数
			if(cl.getClNum()!=null){
				criteria.add(Restrictions.eq("clNum", cl.getClNum()));
			}
		//6.科目
			if(kemu!=null){
				criteria.createAlias("categoryB", "cb");
				if(StringUtils.isNotBlank(kemu)){
					criteria.add(Restrictions.like("cb.cateName", "%"+kemu+"%"));
				}
			}
			List<ClassLie> list = banService.findGaoJi(criteria);
			set("list", list);
		return "queryClassLieSuccess";
	}
	String kemu;
public String getKemu() {
		return kemu;
	}

	public void setKemu(String kemu) {
		this.kemu = kemu;
	}

public String findByAndPage(){
	Page<ClassLie> page = banService.findByPage(creePage);
	push(page);
	return "andpageSuccess";
}
public void set(String arg0,Object arg1){
	ActionContext.getContext().getValueStack().set(arg0, arg1);
}
public void push(Object obj){
	ActionContext.getContext().getValueStack().push(obj);
}
}
