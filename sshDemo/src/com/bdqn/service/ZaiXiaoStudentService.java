package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.bdqn.vo.Page;
import com.bdqn.vo.ZiXueStudent;

public interface ZaiXiaoStudentService {

	Page<ZiXueStudent> findByPage(Integer creePage);

	ZiXueStudent findById(int zid);

	void update(ZiXueStudent zs);

	List<ZiXueStudent> findGaoJi(DetachedCriteria criteria);

	void delete(ZiXueStudent zs);

	void add(ZiXueStudent zs);

}
