package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.bdqn.vo.Page;
import com.bdqn.vo.Student;
import com.bdqn.vo.ZiXueStudent;

public interface StudentService {

	Page<Student> findByPage(Integer creePage);

	void delete(Student student);

	Student findById(Integer zid);

	void update(Student student);

	void add(Student student);

	void inClass(Student student);

	List<Student> findGaoJi(DetachedCriteria criteria);

}
