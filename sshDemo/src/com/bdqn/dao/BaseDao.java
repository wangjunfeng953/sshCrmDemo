package com.bdqn.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.bdqn.vo.CategoryB;


public interface BaseDao<T> {
	//查询总记录数
		public int findCount();
	//分页查询
		public List<T> findByPage(int begin,int pageSize);
		//添加部门
		public void add(T t);
		//修改-回显
		public T findById(int did);
		//修改-改
		public void update(T t);
		//删除
		public void delete(T t);
		public List<T> findAll();
		public List<T> findGaoJi(DetachedCriteria criteria);
}
