package com.bdqn.action;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.bdqn.service.CategoryBService;
import com.bdqn.vo.CategoryB;
import com.bdqn.vo.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CategoryBAction extends ActionSupport implements ModelDriven<CategoryB>{
	private CategoryB c = new CategoryB();
	private CategoryBService cbs;
	
	public CategoryB getC() {
		return c;
	}

	public void setC(CategoryB c) {
		this.c = c;
	}

	public CategoryBService getCbs() {
		return cbs;
	}

	public void setCbs(CategoryBService cbs) {
		this.cbs = cbs;
	}

	int creePage = 1;
	
	public int getCreePage() {
		return creePage;
	}

	public void setCreePage(int creePage) {
		this.creePage = creePage;
	}

	public String cateAndPage(){
		Page<CategoryB> page=cbs.findByPage(creePage);
		push(page);
		return "findPageSuccess";
	}
	
	public String updateUi(){
		c = cbs.findById(c.getCid());
		return "updateUiSuccess";
	}
	
	public String update(){
		cbs.update(c);
		return "updateSuccess";
	}
	
	public String save(){
		cbs.save(c);
		return "saveSuccess";
	}
	
	public String saveUi(){
		
		return "saveUiSuccess";
	}
	public String delete(){
		cbs.delete(c);
		return "deleteSuccess";
	}
	
	public String queryCategory(){
		DetachedCriteria criteria = DetachedCriteria.forClass(CategoryB.class);
		//1.对课程类别进行模糊查询
		if(c.getCateName()!=null&&c.getCateName().trim().length()>0){
			criteria.add(Restrictions.like("cateName", "%"+c.getCateName()+"%"));
		}
		//2.对学时
			//对最低课时
		if(c.getXuetime()!=null){
			criteria.add(Restrictions.ge("xuetime", c.getXuetime()));
		}
			//对最高课时
		if(xuetimeO!=null){
			criteria.add(Restrictions.le("xuetime", xuetimeO));
		}
		//3.对学费
			//最低学费
		if(c.getXuePrice()!=null){
			criteria.add(Restrictions.ge("xuePrice", c.getXuePrice()));
		}
			//最高学费
		if(xuePriceO!=null){
			criteria.add(Restrictions.le("xuePrice", xuePriceO));
		}
		
		List<CategoryB> list = cbs.findGaoJi(criteria);
		set("list", list);
		return "queryCategorySuccess";
	}
	
	public String queryCategoryUi(){
		return "queryCategoryUiSuccess";
	}
	
	Integer xuetimeO;
	Integer xuePriceO;
	
	public void setXuetimeO(Integer xuetimeO) {
		this.xuetimeO = xuetimeO;
	}

	public void setXuePriceO(Integer xuePriceO) {
		this.xuePriceO = xuePriceO;
	}
	
	private void set(String arg0,Object arg1){
		ActionContext.getContext().getValueStack().set(arg0, arg1);
	}

	public void push(Object obj){
		ActionContext.getContext().getValueStack().push(obj);
	}

	public CategoryB getModel() {
		// TODO Auto-generated method stub
		return c;
	}
}
