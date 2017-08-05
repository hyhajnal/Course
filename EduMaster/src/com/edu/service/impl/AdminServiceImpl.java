package com.edu.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.edu.mapper.AdminMapper;
import com.edu.po.Admin;
import com.edu.service.AdminService;


public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminMapper;

	public Admin findAdmin(String anum) throws Exception {
		Admin admin = adminMapper.selectByPrimaryKey(anum);
		return admin;
	}

	public void updateAdmin(Admin admin) throws Exception {
		adminMapper.updateByPrimaryKeySelective(admin);
		
	}




}
