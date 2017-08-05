package com.edu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.po.Course;
import com.edu.service.CourseService;
@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/queryCourseList")
	 public @ResponseBody Map<String,Object> queryCourseList(@RequestParam(value="cname",required = false)String cname) throws Exception{
			List<Course> courseList=courseService.findCourseList(cname);
	        Map<String,Object> map=new HashMap<String,Object>();
	        map.put("total", courseList.size());
	        map.put("rows", courseList);
	        System.out.println(courseList);
	        return map;
	        
	    }
	
	@RequestMapping("/updateCourseSubmit")
	public String updateCourseSubmit(Course course) throws Exception{
		courseService.updateCourse(course);
		return "success"; 
	}
	
	
	@RequestMapping("/deleteCourse")
	public @ResponseBody Map<String,Object> deleteCourse(int cno) throws Exception{
		
	Map<String,Object> map = new HashMap<String,Object>();
	courseService.deleteCourse(cno);
	     map.put("msg", "删除成功");  
	     return map; 
	}
	
	@RequestMapping("/deleteCourses")
	public @ResponseBody Map<String,Object> deleteCourses(Integer[] cnoList) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();  
		int flag=0;
		for(int i=0;i<cnoList.length;i++){

			courseService.deleteCourse(cnoList[i]);
			 
			flag=1;
		}
		 if(flag==1){  
	            map.put("msg", "删除课程成功");  
	        }else{  
	            map.put("msg", "删除课程失败");  
	        }  
	        return map; 
	}
	

	@RequestMapping("/addCourseSubmit")
	public String addCourse(Course course) throws Exception{
	
		courseService.addCourse(course); 
				
				return "success";
	}

}
