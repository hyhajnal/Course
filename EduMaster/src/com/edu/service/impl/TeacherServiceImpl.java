package com.edu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.mapper.CourseMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.mapper.TeacherSMapper;
import com.edu.po.Course;
import com.edu.po.CourseExample;
import com.edu.po.Selectcourse;
import com.edu.po.Student;
import com.edu.po.Teacher;
import com.edu.po.TeacherExample;
import com.edu.pojo.Grade;
import com.edu.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	@Autowired
	TeacherMapper teacherMapper;
	
	@Autowired
	TeacherSMapper teacherSMapper;
	

	public List<Teacher> findTeacherList(String tno,String tname) throws Exception {
		TeacherExample teacher=new TeacherExample();
		TeacherExample.Criteria criteria = teacher.createCriteria();
		if(tno!=null){
			criteria.andTnoEqualTo(tno);
		}
		if(tname!=null){
			criteria.andTnameLike(tname);
		}
		List<Teacher> teacherList=teacherMapper.selectByExample(teacher);
		return teacherList;
	}

	public Teacher findTeacher(String tno) throws Exception {
		Teacher teacher=teacherMapper.selectByPrimaryKey(tno);
		return teacher;
	}

	public void deleteTeacher(String tno) throws Exception {
		teacherMapper.deleteByPrimaryKey(tno);
		
	}

	public void addTeacher(Teacher teacher) throws Exception {
		teacherMapper.insert(teacher);
		
	}

	public void updateTeacher(Teacher teacher) throws Exception {
		teacherMapper.updateByPrimaryKeySelective(teacher);
		
	}

	/*老师端*/
	public List<Course> QueryCourse(String tno) throws Exception {
		List<Course> couList=teacherSMapper.QueryCourse(tno);
		return couList;
	}

	public List<Grade> QueryStuList(int cno) throws Exception {
		List<Grade> stuList=teacherSMapper.QueryStuList(cno);
		return stuList;
	}

	public List<Course> QueryCourseTable(String tno,String week) throws Exception {
		Map<String, Object> params = new  HashMap<String, Object>();
		params.put("tno",tno);
		params.put("weekday", week);
		List<Course> clist=teacherSMapper.QueryCourseTable(params);
		return clist;
	}

	public void updateGrade(Selectcourse sc) throws Exception {
		
		teacherSMapper.updateGrade(sc);
	}

}
