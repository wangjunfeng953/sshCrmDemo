package com.bdqn.vo;

import java.util.List;

public class Page<T> {
private int creePage;//��ǰҳ��
private int totaPage;//��ҳ��
private int pageSize=3;//ÿҳ��ʾ������
private int totaCount;//�ܼ�¼��
private List<T> list;//ÿҳ��ʾ����
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
