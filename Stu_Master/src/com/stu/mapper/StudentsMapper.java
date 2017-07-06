package com.stu.mapper;

import com.stu.po.Students;
import com.stu.po.StudentsExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsMapper {
    int countByExample(StudentsExample example);

    int deleteByExample(StudentsExample example);

    int deleteByPrimaryKey(String sno);

    int insert(Students record);

    int insertSelective(Students record);

    List<Students> selectByExample(StudentsExample example);

    Students selectByPrimaryKey(String sno);

    int updateByExampleSelective(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByExample(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}