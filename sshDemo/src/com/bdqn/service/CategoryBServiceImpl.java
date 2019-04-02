package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;


import com.bdqn.dao.CategoryBDao;
import com.bdqn.vo.CategoryB;
import com.bdqn.vo.Page;

@Transactional
public class CategoryBServiceImpl implements CategoryBService {

	private CategoryBDao cbd;
	
	
	
	public CategoryBDao getCbd() {
		return cbd;
	}



	public void setCbd(CategoryBDao cbd) {
		this.cbd = cbd;
	}

	public void update(CategoryB c) {
		// TODO Auto-generated method stub
		cbd.update(c);
	}
public void save(CategoryB c) {
	// TODO Auto-generated method stub
	cbd.add(c);
}

	public Page<CategoryB> findByPage(int creePage) {
		// TODO Auto-generated method stub
		Page<CategoryB> page=new Page<CategoryB>();
		//���õ�ǰҳ
		page.setCreePage(creePage);
		//����ÿҳ��ʾ����
		page.setPageSize(page.getPageSize());
		//�����ܼ�¼��
		int count = cbd.findCount();
		page.setTotaCount(count);
		//����ҳ��
		int totaPageCount = page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize():page.getTotaCount()/page.getPageSize()+1;
		page.setTotaPage(totaPageCount);
		//����ÿҳ��ʾ����
		int begin = (page.getCreePage()-1)*page.getPageSize();
		List<CategoryB> list = cbd.findByPage(begin, page.getPageSize());
		page.setList(list);
		return page;
	}
	public List<CategoryB> findGaoJi(DetachedCriteria criteria) {
		// TODO Auto-generated method stub
		return cbd.findGaoJi(criteria);
	}
	
	public List<CategoryB> findAll() {
		// TODO Auto-generated method stub
		return cbd.findAll();
	}
	
	public void delete(CategoryB c) {
		// TODO Auto-generated method stub
		cbd.delete(c);
	}
public CategoryB findById(Integer cid) {
	// TODO Auto-generated method stub
	return cbd.findById(cid);
}
}
