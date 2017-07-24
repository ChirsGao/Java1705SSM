package com.situ.ssm.entity;

import java.util.List;

public class Clazz {
	private Integer id;
	private String name;
	private List<Student> list;
	public List<Course> courseList;
	public Clazz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clazz(Integer id, String name, List<Student> list,
			List<Course> courseList) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.courseList = courseList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", name=" + name + ", list=" + list
				+ ", courseList=" + courseList + "]";
	}
	
	
}
