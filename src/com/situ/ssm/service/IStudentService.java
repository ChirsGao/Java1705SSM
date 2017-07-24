package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface IStudentService {
	/*
	 * 查询所有学生信息
	 */
	public List<Student> findAll();
	
	/*
	 * 根据id删除学生信息
	 */
	public boolean delete(int id);
	/*
	 * 修改学生信息
	 */
	public Student update(int id);
	/*
	 * 根据id查询学生信息
	 */
	public Student findById(int id);
	/*
	 * 添加学生
	 */
	public abstract boolean add(Student student);
	/*
	 * 根据条件查询学生
	 */
	public List<Student> findClassAndCourseByCondition(String name);
}
