package com.edu.mapper;

import java.util.List;
import java.util.Map;

import com.edu.po.Course;
import com.edu.po.CourseVo;
import com.edu.po.Score;
import com.edu.po.Selectcourse;

public interface QueryCourseMapper {
	List<Course> QueryCourse(CourseVo courseVo)throws Exception;
	List<Course> QueryHavingCourse(Map<String, Object> params)throws Exception;
	List<Score> QueryHavedCourse(Map<String, Object> params)throws Exception;
	String[] findTid(String tname) throws Exception;
	Selectcourse classConfirm(Map<String, Object> params)throws Exception;/*验证课程是否已经选择*/
}
