package com.edu.service;


import com.edu.po.Admin;



public interface AdminService {
	
	public Admin findAdmin(String anum )throws Exception;
	public void updateAdmin(Admin admin)throws Exception;
}
