package com.stu.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stu.po.Students;
import com.stu.po.StudentsExample;

public class StudentsMapperTest {
	private ApplicationContext applicationContext;
	private StudentsMapper studentsMapper;
	@Before
	//得到spring容器
	public void Setup(){
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/springmvc.xml");
		studentsMapper=(StudentsMapper) applicationContext.getBean("applicationContext");
	}
	@Test
	public void testCountByExample() {
		StudentsExample studentsExample=new StudentsExample();
		StudentsExample.Criteria criteria = studentsExample.createCriteria();
		criteria.andSnameEqualTo("学生1");
		int count=studentsMapper.countByExample(studentsExample);
		System.out.print(count);
	}

	@Test
	public void testDeleteByExample() {
		
	}

	@Test
	public void testDeleteByPrimaryKey() {
	
	}

	@Test
	public void testInsert() {
	
	}

	@Test
	public void testInsertSelective() {

	}

	@Test
	public void testSelectByExample() {

	}

	@Test
	public void testSelectByPrimaryKey() {

	}

	@Test
	public void testUpdateByExampleSelective() {

	}

	@Test
	public void testUpdateByExample() {

	}

	@Test
	public void testUpdateByPrimaryKeySelective() {

	}

	@Test
	public void testUpdateByPrimaryKey() {

	}

}
