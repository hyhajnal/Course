package com.stu.mapper;

import com.stu.po.Dept;
import com.stu.po.DeptExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    int countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(String did);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExampleWithBLOBs(DeptExample example);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(String did);

    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExampleWithBLOBs(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKeyWithBLOBs(Dept record);

    int updateByPrimaryKey(Dept record);
}