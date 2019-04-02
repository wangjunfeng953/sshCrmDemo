package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.bdqn.vo.ClassLie;
import com.bdqn.vo.Page;

public interface ClassLieService {
	public Page<ClassLie> findByPage(int creePage);

	public void delete(ClassLie bid);
	public ClassLie findById(Integer cid);

	public void update(ClassLie c);

	public void save(ClassLie c);

	public List<ClassLie> findGaoJi(DetachedCriteria criteria);

	public List<ClassLie> findAll();
}
