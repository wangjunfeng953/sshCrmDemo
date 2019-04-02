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
		//���õ�ǰҳ
		page.setCreePage(creePage);
		//����ÿҳ��ʾ����
		page.setPageSize(page.getPageSize());
		//�����ܼ�¼��
		int count = banDao.findCount();
		page.setTotaCount(count);
		//����ҳ��
		int totaPageCount = page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize():page.getTotaCount()/page.getPageSize()+1;
		page.setTotaPage(totaPageCount);
		//����ÿҳ��ʾ����
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
