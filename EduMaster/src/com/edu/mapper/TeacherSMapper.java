package com.edu.mapper;

import java.util.List;
import java.util.Map;

import com.edu.po.Course;
import com.edu.po.Selectcourse;
import com.edu.pojo.Grade;


public interface TeacherSMapper {
	/*根据tno查询所有课程*/
	List<Course> QueryCourse(String tno)throws Exception;
	/*根据tno,cno查询学生信息，以及成绩*/
	List<Grade> QueryStuList(int cno)throws Exception;
	List<Course> QueryCourseTable(Map<String, Object> params)throws Exception;
	void updateGrade(Selectcourse sc)throws Exception;
}
