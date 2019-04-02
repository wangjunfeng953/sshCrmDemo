package com.bdqn.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.bdqn.dao.StudentDao;
import com.bdqn.vo.Page;
import com.bdqn.vo.Student;
import com.bdqn.vo.ZiXueStudent;

@Transactional
public class StudentServiceImpl implements StudentService {
	private StudentDao stuDao;
	private ZaiXiaoStudentService zaiService;
	public StudentDao getStuDao() {
		return stuDao;
	}

	public ZaiXiaoStudentService getZaiService() {
		return zaiService;
	}

	public void setZaiService(ZaiXiaoStudentService zaiService) {
		this.zaiService = zaiService;
	}

	public void setStuDao(StudentDao stuDao) {
		this.stuDao = stuDao;
	}
	public void update(Student student) {
		// TODO Auto-generated method stub
		stuDao.update(student);
	}
	public void add(Student student) {
		// TODO Auto-generated method stub
		stuDao.add(student);
	}
	
	public Page<Student> findByPage(Integer creePage) {
		// TODO Auto-generated method stub
		Page<Student> page=new Page<Student>();
		//设置当前页
		page.setCreePage(creePage);
		//设置每页显示条数
		page.setPageSize(page.getPageSize());
		//设置总记录数
		int count = stuDao.findCount();
		page.setTotaCount(count);
		//求总页数
		int totaPageCount = page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize():page.getTotaCount()/page.getPageSize()+1;
		page.setTotaPage(totaPageCount);
		//设置每页显示内容
		int begin = (page.getCreePage()-1)*page.getPageSize();
		List<Student> list = stuDao.findByPage(begin, page.getPageSize());
		page.setList(list);
		return page;
	}
	public void inClass(Student student) {
		// TODO Auto-generated method stub
		Student zstudent = stuDao.findById(student.getZid());
		
		System.out.println(zstudent.getZid()+"。。");
		ZiXueStudent zis=new ZiXueStudent();
		if(zstudent.getZiage()!=null){
			zis.setZiage(zstudent.getZiage());
		}
		if(zstudent.getAddtre()!=null){
			zis.setAddtre(zstudent.getAddtre());
		}
		if(zstudent.getBeiZhu()!=null){
			zis.setBeiZhu(zstudent.getBeiZhu());
		}
		if(zstudent.getClassLie()!=null){
			zis.setClassLie(zstudent.getClassLie());
		}
		if(zstudent.getZiName()!=null){
			zis.setZiName(zstudent.getZiName());
		}
		if(zstudent.getZiqq()!=null){
			zis.setZiqq(zstudent.getZiqq());
		}
		if(zstudent.getZphone()!=null){
			zis.setZphone(zstudent.getZphone());
		}
		if(zstudent.getXueli()!=null){
			zis.setXueli(zstudent.getXueli());
		}
		if(zstudent.getZisex()!=null){
			zis.setZisex(zstudent.getZisex());
		}
		if(zstudent.getZishoot()!=null){
			zis.setZishoot(zstudent.getZishoot());
			System.out.println(zstudent.getZishoot());
		}
		zaiService.add(zis);
		stuDao.delete(student);
	}
	
	public List<Student> findGaoJi(DetachedCriteria criteria) {
		// TODO Auto-generated method stub
		return stuDao.findGaoJi(criteria);
	}
	public Student findById(Integer zid) {
		// TODO Auto-generated method stub
		return stuDao.findById(zid);
	}

	public void delete(Student student) {
		// TODO Auto-generated method stub
		stuDao.delete(student);
	}
}
