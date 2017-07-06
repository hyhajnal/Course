package com.stu.service;

import java.util.List;

import com.stu.po.Students;

public interface StudentsService {
	public List<Students> findStuList()throws Exception;
	public void deleteStu(String sno)throws Exception;
	public void addStu(Students stu)throws Exception;
	public void updateStu(Students stu)throws Exception;
}
