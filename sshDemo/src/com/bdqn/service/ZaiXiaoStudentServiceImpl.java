package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.bdqn.dao.ZiXueStudentDao;
import com.bdqn.vo.ClassLie;
import com.bdqn.vo.Page;
import com.bdqn.vo.ZiXueStudent;
@Transactional
public class ZaiXiaoStudentServiceImpl implements ZaiXiaoStudentService{
private ZiXueStudentDao zsd;

public ZiXueStudentDao getZsd() {
	return zsd;
}

public void setZsd(ZiXueStudentDao zsd) {
	this.zsd = zsd;
}
public Page<ZiXueStudent> findByPage(Integer creePage) {
		// TODO Auto-generated method stub
	Page<ZiXueStudent> page=new Page<ZiXueStudent>();
	//设置当前页
	page.setCreePage(creePage);
	//设置每页显示条数
	page.setPageSize(page.getPageSize());
	//设置总记录数
	int count = zsd.findCount();
	page.setTotaCount(count);
	//求总页数
	int totaPageCount = page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize():page.getTotaCount()/page.getPageSize()+1;
	page.setTotaPage(totaPageCount);
	//设置每页显示内容
	int begin = (page.getCreePage()-1)*page.getPageSize();
	List<ZiXueStudent> list = zsd.findByPage(begin, page.getPageSize());
	page.setList(list);
	return page;
	}
public ZiXueStudent findById(int zid) {
		// TODO Auto-generated method stub
		return zsd.findById(zid);
	}
public void update(ZiXueStudent zs) {
		// TODO Auto-generated method stub
		zsd.update(zs);
	}
public List<ZiXueStudent> findGaoJi(DetachedCriteria criteria) {
		// TODO Auto-generated method stub
		return zsd.findGaoJi(criteria);
	}
public void delete(ZiXueStudent zs) {
		// TODO Auto-generated method stub
		zsd.delete(zs);
	}
public void add(ZiXueStudent zs) {
		// TODO Auto-generated method stub
		zsd.add(zs);
	}
}
