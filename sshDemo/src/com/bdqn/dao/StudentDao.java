package com.bdqn.dao;

import com.bdqn.vo.Student;
import com.bdqn.vo.ZiXueStudent;

public interface StudentDao extends BaseDao<Student>{
	public Student findById(int did);
}
