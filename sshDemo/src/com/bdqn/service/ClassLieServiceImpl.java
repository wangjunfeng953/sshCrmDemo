package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.bdqn.dao.ClassLieDao;
import com.bdqn.vo.ClassLie;
import com.bdqn.vo.Page;

@Transactional
public class ClassLieServiceImpl implements ClassLieService {

	private ClassLieDao banDao;
	


	public ClassLieDao getBanDao() {
		return banDao;
	}

	public void setBanDao(ClassLieDao banDao) {
		this.banDao = banDao;
	}

	public Page<ClassLie> findByPage(int creePage) {
		// TODO Auto-generated method stub
		Page<ClassLie> page=new Page<ClassLie>();
		//设置当前页
		page.setCreePage(creePage);
		//设置每页显示条数
		page.setPageSize(page.getPageSize());
		//设置总记录数
		int count = banDao.findCount();
		page.setTotaCount(count);
		//求总页数
		int totaPageCount = page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize():page.getTotaCount()/page.getPageSize()+1;
		page.setTotaPage(totaPageCount);
		//设置每页显示内容
		int begin = (page.getCreePage()-1)*page.getPageSize();
		List<ClassLie> list = banDao.findByPage(begin, page.getPageSize());
		page.setList(list);
		return page;
	}
	
	
	public ClassLie findById(Integer cid) {
		// TODO Auto-generated method stub
		return banDao.findById(cid);
	}


	public void save(ClassLie c) {
		// TODO Auto-generated method stub
		banDao.add(c);
	}
	public List<ClassLie> findGaoJi(DetachedCriteria criteria) {
		return banDao.findGaoJi(criteria);
	}
	
	public List<ClassLie> findAll() {
		// TODO Auto-generated method stub
		return banDao.findAll();
	}

	public void delete(ClassLie bid) {
		// TODO Auto-generated method stub
		banDao.delete(bid);
	}

	public void update(ClassLie c) {
		// TODO Auto-generated method stub
		banDao.update(c);
	}


}
