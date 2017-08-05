package com.edu.service;

import java.util.List;

import com.edu.po.Course;
import com.edu.po.CourseCustom;
import com.edu.po.CourseVo;
import com.edu.po.Score;
import com.edu.po.Student;
import com.edu.po.StudentCustom;
import com.edu.po.Teacher;

public interface StudentService {
	public StudentCustom findStuInfo(String sno)throws Exception;/*查询学生个人信息*/
	public List<Course> findAllCourse(CourseVo courseVo)throws Exception;/*查询所有课程*/
	public CourseCustom findCourseDetail(int cno)throws Exception;/*查询课程详情*/
	public int SelectCoursebySno(String sno,Integer cno)throws Exception; /*选课*/
	public int DeSelectCoursebySno(String sno,Integer cno)throws Exception;/*退选*/
	public List<Course> findHavingCourseBySno(String sno,String weekday) throws Exception;
	public List<Score> findHavedCourseBySno(String sno) throws Exception;
	public String[] findTid(String tname) throws Exception;
	public String logconfirm(String username)throws Exception;/*登陆验证*/
	public int classConfirm(String sno,int cno)throws Exception;/*验证课程是否已经选择*/
	
	
	
	public List<Student> findStudentList(String sno, String sname)throws Exception;
	public Student findStudent(String sno)throws Exception;
	public void deleteStudent(String sno)throws Exception;
	public void addStudent(Student student)throws Exception;
	public void updateStudent(Student student)throws Exception;
}
