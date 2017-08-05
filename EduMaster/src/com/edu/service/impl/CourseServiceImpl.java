package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.mapper.CourseMapper;
import com.edu.po.Course;
import com.edu.po.CourseExample;
import com.edu.service.CourseService;

public class CourseServiceImpl implements CourseService {
	@Autowired 
	CourseMapper courseMapper;
	
	public List<Course> findCourseList(String cname) throws Exception {
		CourseExample course=new CourseExample();
		CourseExample.Criteria criteria = course.createCriteria();
		if(cname!=null){
					criteria.andCnameLike(cname);
				}
		List<Course> teacherList=courseMapper.selectByExample(course);
		return teacherList;
	}

	public Course findCourse(int cno) throws Exception {
		Course course=courseMapper.selectByPrimaryKey(cno);
		return course;
	}

	public void deleteCourse(int cno) throws Exception {
		courseMapper.deleteByPrimaryKey(cno);
		
	}

	public void addCourse(Course course) throws Exception {
		courseMapper.insertSelective(course);
		
	}

	public void updateCourse(Course course) throws Exception {
		courseMapper.updateByPrimaryKeySelective(course);
		
	}

}
