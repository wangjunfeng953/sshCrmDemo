package com.bdqn.vo;

import java.util.Date;

public class ClassLie {
	private  Integer bid; 
	private  String cbName; //班级名称
	private  Date intoDay;//入学时间
	private  Date outDay;//毕业时间
	private  Integer statZ;//是否入学
	private  Integer clNum;//班级人数
	private CategoryB categoryB;
	
	public CategoryB getCategoryB() {
		return categoryB;
	}
	public void setCategoryB(CategoryB categoryB) {
		this.categoryB = categoryB;
	}
	// 多的一方
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getCbName() {
		return cbName;
	}
	public void setCbName(String cbName) {
		this.cbName = cbName;
	}
	public Date getIntoDay() {
		return intoDay;
	}
	public void setIntoDay(Date intoDay) {
		this.intoDay = intoDay;
	}
	public Date getOutDay() {
		return outDay;
	}
	public void setOutDay(Date outDay) {
		this.outDay = outDay;
	}
	public Integer getStatZ() {
		return statZ;
	}
	public void setStatZ(Integer statZ) {
		this.statZ = statZ;
	}
	public Integer getClNum() {
		return clNum;
	}
	public void setClNum(Integer clNum) {
		this.clNum = clNum;
	}

}
