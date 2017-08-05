package com.edu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.mapper.CourseMapper;
import com.edu.mapper.MajorMapper;
import com.edu.mapper.QueryCourseMapper;
import com.edu.mapper.SelectcourseMapper;
import com.edu.mapper.StudentMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.po.Course;
import com.edu.po.CourseCustom;
import com.edu.po.CourseVo;
import com.edu.po.Major;
import com.edu.po.Score;
import com.edu.po.Selectcourse;
import com.edu.po.SelectcourseExample;
import com.edu.po.Student;
import com.edu.po.StudentCustom;
import com.edu.po.StudentExample;
import com.edu.po.Teacher;
import com.edu.po.TeacherExample;
import com.edu.service.StudentService;

public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	MajorMapper majorMapper;
	@Autowired
	CourseMapper courseMapper; 
	@Autowired
	TeacherMapper teacherMapper;
	@Autowired
	SelectcourseMapper selectcourseMapper;
	@Autowired
	QueryCourseMapper queryCourseMapper;
	/*查询学生个人信息*/
	public StudentCustom findStuInfo(String sno) throws Exception {
		Student student=studentMapper.selectByPrimaryKey(sno);
		String majornum=student.getMajornum();
		Major major=majorMapper.selectByPrimaryKey(majornum);
		StudentCustom studentCustom=new StudentCustom();
		studentCustom.setMajor(major);
		studentCustom.setStudent(student);
		return studentCustom;
	}
	/*根据查询条件查询课程列表*/
	public List<Course> findAllCourse(CourseVo courseVo) throws Exception {
		List<Course> courseList=queryCourseMapper.QueryCourse(courseVo);
		return courseList;
		
	}
	/*查询课程详情*/
	public CourseCustom findCourseDetail(int cno) throws Exception {
		Course course=courseMapper.selectByPrimaryKey(cno);
		Teacher teacher=teacherMapper.selectByPrimaryKey(course.getTno());
		CourseCustom courseCustom=new CourseCustom();
		courseCustom.setCourse(course);
		courseCustom.setTeacher(teacher);
		return courseCustom;
	}

	public List<Score> findHavedCourseBySno(String sno) throws Exception {
		Map<String, Object> params = new  HashMap<String, Object>();
		params.put("sno",sno);
		List<Score> havedList=queryCourseMapper.QueryHavedCourse(params);
		return havedList;
	}

	public List<Course> findHavingCourseBySno(String sno,String weekday) throws Exception {
		Map<String, Object> params = new  HashMap<String, Object>();
		params.put("sno",sno);
		params.put("weekday", weekday);
		List<Course> havingList=queryCourseMapper.QueryHavingCourse(params);
		return havingList;
	}
	/*选课*/
	public int SelectCoursebySno(String sno, Integer cno) throws Exception {
		Selectcourse selectcourse=new Selectcourse();
		selectcourse.setCno(cno);
		selectcourse.setSno(sno);
		selectcourseMapper.insert(selectcourse);
		return 1;

		
	}

	/*退选*/
	public int DeSelectCoursebySno(String sno, Integer cno) throws Exception {
		SelectcourseExample selectcourseExample=new SelectcourseExample();
		SelectcourseExample.Criteria criteria=selectcourseExample.createCriteria();
		criteria.andCnoEqualTo(cno);
		criteria.andSnoEqualTo(sno);
		selectcourseMapper.deleteByExample(selectcourseExample);
		return 1;
		
	}
	public String[] findTid(String tname) throws Exception {
		String[] tnos=queryCourseMapper.findTid(tname);
		return tnos;
	}
	public String logconfirm(String username) throws Exception {
		Student student=studentMapper.selectByPrimaryKey(username);	
		if(student!=null){
			return student.getSpsd();
		}else{
			return "";
		}
		
	}
	public int classConfirm(String sno,int cno) throws Exception {
		Map<String, Object> params = new  HashMap<String, Object>();
		params.put("sno",sno);
		params.put("cno", cno);
		Selectcourse selectcourse=queryCourseMapper.classConfirm(params);
		if(selectcourse!=null){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	/*增删改查*/
	
	public List<Student> findStudentList(String sno,String sname) throws Exception {
		StudentExample student=new StudentExample();
		StudentExample.Criteria criteria = student.createCriteria();
		if(sno!=null){
			criteria.andSnoEqualTo(sno);
		}
		if(sname!=null){
			criteria.andSnameLike(sname);
		}
		List<Student> studentList=studentMapper.selectByExample(student);
		return studentList;
	}
	public Student findStudent(String sno) throws Exception {
		Student student=studentMapper.selectByPrimaryKey(sno);
		return student;
	}
	public void deleteStudent(String sno) throws Exception {
		studentMapper.deleteByPrimaryKey(sno);
		
	}
	public void addStudent(Student student) throws Exception {
		studentMapper.insert(student);
		
	}
	public void updateStudent(Student student) throws Exception {
		studentMapper.updateByPrimaryKeySelective(student);
		
	}


}
