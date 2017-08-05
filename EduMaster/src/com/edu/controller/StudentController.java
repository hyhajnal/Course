package com.edu.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.edu.po.Course;
import com.edu.po.CourseCustom;
import com.edu.po.CourseVo;
import com.edu.po.Score;
import com.edu.po.Student;
import com.edu.po.StudentCustom;
import com.edu.pojo.CourseAll;
import com.edu.pojo.Message;
import com.edu.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/personal")	
	public ModelAndView queryStuInfo(HttpSession session) throws Exception {
		String sno=(String) session.getAttribute("username");
		StudentCustom stu=studentService.findStuInfo(sno);
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("stu", stu);

		modelAndView.setViewName("stu/personal");

		return modelAndView;

	}
	
	@RequestMapping("/queryCourse")
	public String queryCourse(Model model,CourseVo courseVo,HttpSession session) throws Exception{
		String sno=(String) session.getAttribute("username");
		int flag=1;/*用来标记老师是否能查到*/
		if(courseVo.getPageSize()==0){
			courseVo=new CourseVo(null,null,null,null, 9,1);
		}
		String tname=courseVo.getTname();
		if(tname!=null&&tname!=""){
			String[] tnos=studentService.findTid(tname);
			if(tnos.length==0){
				flag=0;
			}else{
				courseVo.setTnos(tnos);
			}
		}
		/*courseVo2是为了得到总记录数去判断*/
		CourseVo courseVo2=new CourseVo();
		courseVo2=(CourseVo) courseVo.clone();/*深拷贝*/
		courseVo2.setPageSize(0);
		courseVo2.setCurrentPage(0);
		List<Course> courseList2=studentService.findAllCourse(courseVo2);
		int PageCount=courseList2.size();
		courseVo.setF_jilu();
		courseVo.setL_jilu();
		/*最后一条记录*/
		if(courseVo.getL_jilu()>PageCount){
			courseVo.setL_jilu(PageCount);
		}
		/*如果教师列表查到了*/
		if(flag!=0){
			List<Course> courseList=studentService.findAllCourse(courseVo);
			/*验证是否已经选了课程*/
			ArrayList<CourseAll> all=new ArrayList<CourseAll>();
			for(Course c:courseList){
				CourseAll cc=new CourseAll();
				int k=studentService.classConfirm(sno, c.getCno());
				if(k==1){
					cc.setIsSelect("退选");
				}else{
					cc.setIsSelect("加入");
				}
				cc.setCourse(c);
				all.add(cc);
			}
			model.addAttribute("All", all);
		}

		model.addAttribute("currentPage", courseVo.getCurrentPage());
		model.addAttribute("PageCount", PageCount);
		return "stu/selectCourse";
	}
	
	@RequestMapping("/queryHavingCourse")
	public ModelAndView queryHavingCourse(HttpSession session) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		String sno=(String) session.getAttribute("username");
		List<Course> havingList1=studentService.findHavingCourseBySno(sno, "周一");
		List<Course> havingList2=studentService.findHavingCourseBySno(sno, "周二");
		List<Course> havingList3=studentService.findHavingCourseBySno(sno, "周三");
		List<Course> havingList4=studentService.findHavingCourseBySno(sno, "周四");
		List<Course> havingList5=studentService.findHavingCourseBySno(sno, "周五");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Mon", havingList1);
		map.put("Tues", havingList2);
		map.put("Wed", havingList3);
		map.put("Thur", havingList4);
		map.put("Fri", havingList5);
		modelAndView.addObject("courseList",map);

		modelAndView.setViewName("stu/courseTable");
		
		return modelAndView;
	}
	
	@RequestMapping("/queryHavedCourse")
	public ModelAndView queryHavedCourse(HttpSession session) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		String sno=(String) session.getAttribute("username");
		List<Score> havedList=studentService.findHavedCourseBySno(sno);
		modelAndView.addObject("havedList", havedList);
		modelAndView.setViewName("stu/grade");

		return modelAndView;
	}
	@RequestMapping("/queryCourseDetail")
	public @ResponseBody Map<String,Object> queryCourseDetail(HttpSession session,Integer cno) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		CourseCustom courseCustom=studentService.findCourseDetail(cno);
		map.put("course", courseCustom);
		return map;
	}
	/*选课*/
	@RequestMapping("/SelectCourse")
	public @ResponseBody Map<String,Object> SelectCourse(HttpSession session,Integer cno) throws Exception{
		String sno=(String) session.getAttribute("username");
		int result=studentService.SelectCoursebySno(sno, cno);
		Message message=new Message();
		Map<String,Object> map = new HashMap<String,Object>();
		if(result!=1){
			message.setError("选择失败");
		}
		else{
			message.setSuccess("选择成功");
		}

		map.put("message", message);
		return map;
	}
	/*退选*/
	@RequestMapping("/DeSelectCourse")
	public @ResponseBody Map<String,Object> DeSelectCourse(HttpSession session,Integer cno) throws Exception{
		String sno=(String) session.getAttribute("username");
		Map<String,Object> map = new HashMap<String,Object>();
		int result=studentService.DeSelectCoursebySno(sno, cno);
		Message message=new Message();
		if(result!=1){
			message.setError("退选失败");
		}
		else{
			message.setSuccess("退选成功");
		}

		map.put("message", message);
		return map;
	}
	
	
	
	/*
	 * 
	 * 学生增删改查
	 * 
	 * 
	 * */
	
	@RequestMapping("/queryStudentList")
	 public @ResponseBody Map<String,Object> queryStudentList(@RequestParam(value="sno",required = false)String sno,
			 @RequestParam(value="sname",required = false)String sname) throws Exception{
			List<Student> StudentList=studentService.findStudentList(sno,sname);
	        Map<String,Object> map=new HashMap<String,Object>();
	        map.put("total", StudentList.size());
	        map.put("rows", StudentList);
	        System.out.println(StudentList);
	        return map;
	        
	    }
	
	@RequestMapping("/updateStudentSubmit")
	public String updateStudentSubmit(Student student) throws Exception{
		studentService.updateStudent(student);
		return "success"; 
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(Student student) throws Exception{
		studentService.updateStudent(student);
		return "redirect:/personal.do"; 
	}
	
	
	@RequestMapping("/deleteStudent")
	public @ResponseBody Map<String,Object> deleteStudent(String sno) throws Exception{
		
	Map<String,Object> map = new HashMap<String,Object>();
	studentService.deleteStudent(sno);
	     map.put("msg", "删除成功");  
	     return map; 
	}
	
	@RequestMapping("/deleteStudents")
	public @ResponseBody Map<String,Object> deleteStudents(String[] snoList) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();  
		int flag=0;
		for(int i=0;i<snoList.length;i++){

			studentService.deleteStudent(snoList[i]);
			 
			flag=1;
		}
		 if(flag==1){  
	            map.put("msg", "删除课程成功");  
	        }else{  
	            map.put("msg", "删除课程失败");  
	        }  
	        return map; 
	}
	

	@RequestMapping("/addStudentSubmit")
	public String addStudent(Student student) throws Exception{
	
		studentService.addStudent(student); 
				
		return "success";
	}
}
