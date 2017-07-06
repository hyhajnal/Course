package com.stu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.stu.mapper.StudentsMapper;
import com.stu.po.Students;
import com.stu.po.StudentsExample;
import com.stu.service.StudentsService;

public class StudentsServiceImpl implements StudentsService {
	@Autowired
    StudentsMapper studentsMapper;
	public List<Students> findStuList()throws Exception{
		StudentsExample studentsExample=new StudentsExample();
		StudentsExample.Criteria criteria = studentsExample.createCriteria();
		//criteria.andSnameEqualTo("学生1");
		List<Students> stulist=studentsMapper.selectByExample(studentsExample);
		return stulist;
	}
	@Override
	public void deleteStu(String sno) throws Exception {
		studentsMapper.deleteByPrimaryKey(sno);
		
	}
	@Override
	public void addStu(Students stu) throws Exception {
		studentsMapper.insert(stu);
		
	}
	@Override
	public void updateStu(Students stu) throws Exception {
		studentsMapper.updateByPrimaryKey(stu);
		
	}

}
