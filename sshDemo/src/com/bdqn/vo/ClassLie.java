package com.bdqn.vo;

import java.util.Date;

public class ClassLie {
	private  Integer bid; 
	private  String cbName; //�༶����
	private  Date intoDay;//��ѧʱ��
	private  Date outDay;//��ҵʱ��
	private  Integer statZ;//�Ƿ���ѧ
	private  Integer clNum;//�༶����
	private CategoryB categoryB;
	
	public CategoryB getCategoryB() {
		return categoryB;
	}
	public void setCategoryB(CategoryB categoryB) {
		this.categoryB = categoryB;
	}
	// ���һ��
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
