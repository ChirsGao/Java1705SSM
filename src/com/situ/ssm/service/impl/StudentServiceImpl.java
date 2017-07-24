package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{

	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	public List<Student> findAll() {
		return studentDao.findAll();
	}


	public boolean delete(int id) {
		return studentDao.delete(id);
	}

	public Student findById(int id) {
		return studentDao.findById(id);
	}

	public Student update(int id) {
		return studentDao.update(id);
	}

	public boolean add(Student student) {
		return studentDao.add(student);
	}


	@Override
	public List<Student> findClassAndCourseByCondition(String name) {
		return studentDao.findClassAndCourseByCondition(name);
	}



}
