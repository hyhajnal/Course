package com.edu.service;

import java.util.List;

import com.edu.po.Course;

public interface CourseService {

	public List<Course> findCourseList(String cname)throws Exception;
	public Course findCourse(int cno)throws Exception;
	public void deleteCourse(int cno)throws Exception;
	public void addCourse(Course course)throws Exception;
	public void updateCourse(Course course)throws Exception;
}
