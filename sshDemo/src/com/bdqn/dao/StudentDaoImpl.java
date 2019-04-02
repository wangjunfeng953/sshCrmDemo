package com.bdqn.dao;

import com.bdqn.dao.StudentDao;
import com.bdqn.dao.ZiXueStudentDao;
import com.bdqn.vo.Student;
import com.bdqn.vo.ZiXueStudent;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {
	@Override
	public Student findById(int did) {
		// TODO Auto-generated method stub
		Student zstudent = super.findById(did);
		createHibernateTemplate(getSessionFactory()).clear();
		return zstudent;
	}
}
