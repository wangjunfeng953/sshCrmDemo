package com.bdqn.vo;
//在校学生
public class Student{
	private  Integer zid;//id
	private String ziName;//姓名
	private String zisex;//性别
	private Integer zphone;//电话
	private Integer ziqq;//qq
	private String addtre;//地址
	private String zishoot;//学校
	private Integer ziage;//年龄
	private String xueli;//学历
	private String beiZhu;//备注
	//班级和咨询学生是一对多
	private ClassLie classLie;
	public Integer getZid() {
		return zid;
	}
	public void setZid(Integer zid) {
		this.zid = zid;
	}
	public String getZiName() {
		return ziName;
	}
	public void setZiName(String ziName) {
		this.ziName = ziName;
	}
	public String getZisex() {
		return zisex;
	}
	public void setZisex(String zisex) {
		this.zisex = zisex;
	}
	public Integer getZphone() {
		return zphone;
	}
	public void setZphone(Integer zphone) {
		this.zphone = zphone;
	}
	public Integer getZiqq() {
		return ziqq;
	}
	public void setZiqq(Integer ziqq) {
		this.ziqq = ziqq;
	}
	public String getAddtre() {
		return addtre;
	}
	public void setAddtre(String addtre) {
		this.addtre = addtre;
	}
	public String getZishoot() {
		return zishoot;
	}
	public void setZishoot(String zishoot) {
		this.zishoot = zishoot;
	}
	public Integer getZiage() {
		return ziage;
	}
	public void setZiage(Integer ziage) {
		this.ziage = ziage;
	}
	public String getXueli() {
		return xueli;
	}
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	public String getBeiZhu() {
		return beiZhu;
	}
	public void setBeiZhu(String beiZhu) {
		this.beiZhu = beiZhu;
	}
	public ClassLie getClassLie() {
		return classLie;
	}
	public void setClassLie(ClassLie classLie) {
		this.classLie = classLie;
	}
	
}
