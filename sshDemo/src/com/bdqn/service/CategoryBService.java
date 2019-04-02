package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.bdqn.vo.CategoryB;
import com.bdqn.vo.Department;
import com.bdqn.vo.Page;

public interface CategoryBService {
	public Page<CategoryB> findByPage(int creePage);

	public void delete(CategoryB c);

	public CategoryB findById(Integer cid);

	public void update(CategoryB c);

	public void save(CategoryB c);
	
	public List<CategoryB> findGaoJi(DetachedCriteria criteria);

	public List<CategoryB> findAll();
}
