package com.stu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.stu.po.Students;
import com.stu.service.StudentsService;
@Controller
public class StudentsController {

	@Autowired
	private StudentsService studentsService;
	
	/*@RequestMapping("/queryStuList")
	private ModelAndView queryStuList() throws Exception{
		List<Students> stulist=studentsService.findStuList();
		ModelAndView modelAndview=new ModelAndView();
		modelAndview.addObject("stulist", stulist);
		modelAndview.setViewName("student/stuList");
		return modelAndview;
	}*/
	
	@RequestMapping("/queryStuList")
	
	 public @ResponseBody Map<String,Object> queryUserList(HttpServletRequest request) throws Exception{
    
		List<Students> stulist=studentsService.findStuList();
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("total", stulist.size());
       map.put("rows", stulist);
       System.out.println(stulist);
       return map;
       
   }
	
	@RequestMapping(value="/deleteStu",method=RequestMethod.POST,produces="application/json")
	
	 public  void deleteStu(@RequestBody Students stu) throws Exception{
		studentsService.deleteStu(stu.getSno());

      
  }
	
	@RequestMapping("/addStu")
	
	 public  void addStu( Students stu) throws Exception{
		studentsService.addStu(stu);

     
 }
	@RequestMapping("/editStu")
	
	 public  void editStu( Students stu) throws Exception{
		studentsService.updateStu(stu);

    }
}
