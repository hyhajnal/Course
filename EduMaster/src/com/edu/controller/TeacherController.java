package com.edu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import com.edu.po.Course;
import com.edu.po.Selectcourse;
import com.edu.po.Student;
import com.edu.po.Teacher;
import com.edu.pojo.Grade;
import com.edu.pojo.GradeList;
import com.edu.service.CourseService;
import com.edu.service.TeacherService;


@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/checkTeacher")
	@ResponseBody
	 public JSONPObject checkTeacher(String tno,String tpsd,String callback) throws Exception{
			Teacher teacher=teacherService.findTeacher(tno);
			Map<String,Object> map = new HashMap<String,Object>();
			if(teacher!=null&&teacher.getTpsd().equals(tpsd)){
				map.put("message", "验证成功");
			}else
				map.put("message", "用户名或密码错误");
	        
			return new JSONPObject(callback, map);
	    }
	
	@RequestMapping("/queryTeacher")
	@ResponseBody
	 public JSONPObject queryTeacher(String tno,String callback) throws Exception{
			/*String tno="T001";*/
			Teacher teacher=teacherService.findTeacher(tno);
	        return new JSONPObject(callback, teacher);
	        
	    }
	
	@RequestMapping("/queryClassByTno")
	@ResponseBody
	 public JSONPObject  queryClassByTno(String tno,String callback) throws Exception{
			/*String tno="T001";*/
			System.out.print(callback);
			List<Course> cList=teacherService.QueryCourse(tno);
	        return new JSONPObject(callback, cList);
	        
	    }
	
	@RequestMapping("/queryCTableByTno")
	@ResponseBody
	 public JSONPObject  queryCTableByTno(String tno,String callback) throws Exception{
			/*String tno="T001";*/
			List<Course> cList1=teacherService.QueryCourseTable(tno, "周一");
			List<Course> cList2=teacherService.QueryCourseTable(tno, "周二");
			List<Course> cList3=teacherService.QueryCourseTable(tno, "周三");
			List<Course> cList4=teacherService.QueryCourseTable(tno, "周四");
			List<Course> cList5=teacherService.QueryCourseTable(tno, "周五");
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("Mon", cList1);
			map.put("Tue", cList2);
			map.put("Wed", cList3);
			map.put("Thr", cList4);
			map.put("Fri", cList5);
	        return new JSONPObject(callback, map);
	        
	    }

	@RequestMapping("/queryStuByCno")
	@ResponseBody
	 public JSONPObject queryStuByCno(String callback,int cno) throws Exception{
			/*int cno=7;*/
			List<Grade> stuList=teacherService.QueryStuList(cno);
	        return new JSONPObject(callback, stuList);
	        
	    }
	@RequestMapping("/updateTeacher")
	@ResponseBody
	public void updateTeacher(Teacher teacher) throws Exception{
		if(teacher.getMajorinfo()==""){
			teacher.setMajorinfo(null);
		}
		teacherService.updateTeacher(teacher);
	}
	
	@RequestMapping("/updateGrade")
	public void updateGrade(@RequestBody Selectcourse[] scList) throws Exception{
/*		List<Selectcourse> scList=gL.getScList();*/
		for(int i=0;i<scList.length;i++){
			teacherService.updateGrade(scList[i]);
		}

	}
	
	@RequestMapping("/addCourse")
	public void addCourse(@RequestBody Course course) throws Exception{
	
		courseService.addCourse(course); 
				
		
	}
	
/*	@RequestMapping("/updateClassInfo")
	@ResponseBody
	 public JSONPObject updateClassInfo(String tno,String callback) throws Exception{
			String tno="T001";
			Teacher teacher=teacherService.findTeacher(tno);
	        return new JSONPObject(callback, teacher);
	        
	    }*/
	
	/*后台部分*/
	
	@RequestMapping("/queryTeacherList")
	 public @ResponseBody Map<String,Object> queryTeacherList(@RequestParam(value="tname",required = false)String tname,
			 @RequestParam(value="tno",required = false)String tno) throws Exception{
			List<Teacher> teacherList=teacherService.findTeacherList(tno,tname);
	        Map<String,Object> map=new HashMap<String,Object>();
	        map.put("total", teacherList.size());
	        map.put("rows", teacherList);
	        System.out.println(teacherList);
	        return map;
	        
	    }
	
	@RequestMapping("/updateTeacherSubmit")
	public String updateTeacherSubmit(Teacher teacher) throws Exception{
		if(teacher.getMajorinfo()==""){
			teacher.setMajorinfo(null);
		}
		teacherService.updateTeacher(teacher);
		return "success"; 
	}
	
	
	@RequestMapping("/deleteTeacher")
	public @ResponseBody Map<String,Object> deleteTeacher(String tno) throws Exception{
		
	Map<String,Object> map = new HashMap<String,Object>();
	teacherService.deleteTeacher(tno);
	     map.put("msg", "删除成功");  
	     return map; 
	}
	
	@RequestMapping("/deleteTeachers")
	public @ResponseBody Map<String,Object> deleteTeachers(String[] tnoList) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();  
		int flag=0;
		for(int i=0;i<tnoList.length;i++){

			teacherService.deleteTeacher(tnoList[i]);
			 
			flag=1;
		}
		 if(flag==1){  
	            map.put("msg", "删除教师成功");  
	        }else{  
	            map.put("msg", "删除教师失败");  
	        }  
	        return map; 
	}
	

	@RequestMapping("/addTeacherSubmit")
	public String addTeacher(Teacher teacher) throws Exception{
	
		teacherService.addTeacher(teacher); 
				
				return "success";
	}
	

}
