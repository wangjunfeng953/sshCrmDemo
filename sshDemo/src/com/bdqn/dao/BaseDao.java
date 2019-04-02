package com.bdqn.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.bdqn.vo.CategoryB;


public interface BaseDao<T> {
	//��ѯ�ܼ�¼��
		public int findCount();
	//��ҳ��ѯ
		public List<T> findByPage(int begin,int pageSize);
		//��Ӳ���
		public void add(T t);
		//�޸�-����
		public T findById(int did);
		//�޸�-��
		public void update(T t);
		//ɾ��
		public void delete(T t);
		public List<T> findAll();
		public List<T> findGaoJi(DetachedCriteria criteria);
}
