package com.bdqn.vo;

import java.util.List;

public class Page<T> {
private int creePage;//当前页面
private int totaPage;//总页数
private int pageSize=3;//每页显示多少条
private int totaCount;//总记录数
private List<T> list;//每页显示数据
public int getCreePage() {
	return creePage;
}
public void setCreePage(int creePage) {
	this.creePage = creePage;
}
public int getTotaPage() {
	return totaPage;
}
public void setTotaPage(int totaPage) {
	this.totaPage = totaPage;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotaCount() {
	return totaCount;
}
public void setTotaCount(int totaCount) {
	this.totaCount = totaCount;
}
public List<T> getList() {
	return list;
}
public void setList(List<T> list) {
	this.list = list;
}

}
