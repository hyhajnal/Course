package com.edu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edu.service.StudentService;


@Controller
public class LoginController {
	@Autowired
	private StudentService stuService ;
	// 登陆
	@RequestMapping("/loginCheck")
	public String login(Model model,HttpSession session, String username, String password)
			throws Exception {
		// 调用service进行用户身份验证
		
		String s=stuService.logconfirm(username);
		/* if (!(code.equalsIgnoreCase(session.getAttribute("code").toString()))){
			
			 model.addAttribute("msg", "验证码错误");
			 return "error";
		 }else */
			 if(s==""||!password.equals(s)){
						
			model.addAttribute("msg", "用户名或密码错误");
			return "stu/login";
		}else
			// 在session中保存用户身份信息
			session.setAttribute("username", username);
			// 重定向到商品列表页面
			return "redirect:/personal.do";

		
	}

	// 退出
/*	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到商品列表页面
		return "redirect:/querylist.do";
	}*/
	
	@RequestMapping("/login")
	public ModelAndView login() throws Exception {
		ModelAndView model=new ModelAndView();
		model.setViewName("stu/login");
		return model;
	}

}
