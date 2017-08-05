package com.edu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import com.edu.po.Admin;
import com.edu.service.AdminService;


@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/queryaAdmin")
	 public String queryAdmin(Model model) throws Exception{
		    String anum="admin";
			Admin admin=adminService.findAdmin(anum);
			model.addAttribute("admin",admin);
	        return "mange/admin";
	        
	    }
	
	@RequestMapping("/updateAdminSubmit")
	public String updateAdminSubmit(Admin admin) throws Exception{
		adminService.updateAdmin(admin);
		return "success"; 
	}
	
	
	
}
