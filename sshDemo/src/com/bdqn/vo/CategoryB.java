package com.bdqn.vo;

import java.util.HashSet;
import java.util.Set;

public class CategoryB {
	private  Integer cid;//id
	private  String cateName;//����
	private  String intrdJie;//����
	private  Integer  xuetime;//ѧϰʱ��
	private  Integer xuePrice;// �۸�
	//һ��һ����
	private Set<ClassLie> classLies =new HashSet<ClassLie>();
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getIntrdJie() {
		return intrdJie;
	}
	public void setIntrdJie(String intrdJie) {
		this.intrdJie = intrdJie;
	}
	public Integer getXuetime() {
		return xuetime;
	}
	public void setXuetime(Integer xuetime) {
		this.xuetime = xuetime;
	}
	public Integer getXuePrice() {
		return xuePrice;
	}
	public void setXuePrice(Integer xuePrice) {
		this.xuePrice = xuePrice;
	}
	public Set<ClassLie> getClassLies() {
		return classLies;
	}
	public void setClassLies(Set<ClassLie> classLies) {
		this.classLies = classLies;
	}

}
