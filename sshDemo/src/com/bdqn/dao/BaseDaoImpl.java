package com.bdqn.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bdqn.vo.CategoryB;


public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{
	
	private Class c;
	public BaseDaoImpl(){
		Class c1 = this.getClass();
		Type type = c1.getGenericSuperclass();
		ParameterizedType p=(ParameterizedType) type;
		Type[] t = p.getActualTypeArguments();
		Class c =(Class) t[0];
		this.c=c;
	}
	
	public List<T> findGaoJi(DetachedCriteria criteria) {
			// TODO Auto-generated method stub
			return this.getHibernateTemplate().findByCriteria(criteria);
		}
	public int findCount() {
		// TODO Auto-generated method stub
		String hql="select  count(*) from "+c.getSimpleName();
		List <Number>list = this.getHibernateTemplate().find(hql);
		if(list.size()> 0 && list!=null){
			return list.get(0).intValue();
		}
		return 0;

	}
	public List<T> findByPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(c);
		List list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		if(list.size()> 0 && list!=null){
			return list;
		}
		return null;
	}
	public void add(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(t);
	}
	public T findById(int did) {
		// TODO Auto-generated method stub
		return (T)this.getHibernateTemplate().get(c, did);
	}
	public void update(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(t);
	}
	public void delete(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(t);
	}
	public List<T> findAll() {
		// TODO Auto-generated method stub
		String hql="from "+c.getSimpleName();
		List<T> list = this.getHibernateTemplate().find(hql);
		System.out.println(list.size());
		return list;
	}
}
