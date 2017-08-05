package com.edu.service;

import java.util.List;

import com.edu.po.Course;
import com.edu.po.Selectcourse;
import com.edu.po.Teacher;
import com.edu.pojo.Grade;


public interface TeacherService {
	
	public List<Teacher> findTeacherList(String tno, String tname)throws Exception;
	public Teacher findTeacher(String tno)throws Exception;
	public void deleteTeacher(String tno)throws Exception;
	public void addTeacher(Teacher teacher)throws Exception;
	public void updateTeacher(Teacher teacher)throws Exception;
	/*根据tno查询所有课程*/
	public List<Course> QueryCourse(String tno)throws Exception;
	/*查询课表*/
	public List<Course> QueryCourseTable(String tno,String week)throws Exception;
	/*根据tno,cno查询学生信息，以及成绩*/
	public List<Grade> QueryStuList(int cno)throws Exception;
	
	public void updateGrade(Selectcourse sc)throws Exception;

}
