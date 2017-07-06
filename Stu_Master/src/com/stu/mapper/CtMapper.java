package com.stu.mapper;

import com.stu.po.Ct;
import com.stu.po.CtExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtMapper {
    int countByExample(CtExample example);

    int deleteByExample(CtExample example);

    int deleteByPrimaryKey(Integer ctid);

    int insert(Ct record);

    int insertSelective(Ct record);

    List<Ct> selectByExample(CtExample example);

    Ct selectByPrimaryKey(Integer ctid);

    int updateByExampleSelective(@Param("record") Ct record, @Param("example") CtExample example);

    int updateByExample(@Param("record") Ct record, @Param("example") CtExample example);

    int updateByPrimaryKeySelective(Ct record);

    int updateByPrimaryKey(Ct record);
}