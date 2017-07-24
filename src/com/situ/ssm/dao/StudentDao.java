package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface StudentDao {

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
	public boolean add(Student student);

	public List<Student> findClassAndCourseByCondition(String name);

}
