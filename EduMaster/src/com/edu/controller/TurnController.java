package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TurnController {

	@RequestMapping("/BackMaster")
	public String BackMaster(){
		return "mange/backMaster";
	}
	
	
	@RequestMapping("/StudentMain")
	public String StudentMain(){
		return "mange/student";
	}
	
	@RequestMapping("/TeacherMain")
	public String TeacherMain(){
		return "mange/teacher";
	}

	/*服务*/
	@RequestMapping("/CourseMain")
	public String CourseMain(){
		return "mange/course";
	}
}
