package com.situ.ssm.entity;

import com.situ.ssm.entity.Clazz;

public class Course {
	
    private Integer id;
    private String name;
    private String credit;
    private Clazz courseList;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public Clazz getCourseList() {
		return courseList;
	}
	public void setCourseList(Clazz courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit=" + credit
				+ ", courseList=" + courseList + "]";
	}

    
    
}

