package com.stu.mapper;

import com.stu.po.Cs;
import com.stu.po.CsExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsMapper {
    int countByExample(CsExample example);

    int deleteByExample(CsExample example);

    int deleteByPrimaryKey(Integer csid);

    int insert(Cs record);

    int insertSelective(Cs record);

    List<Cs> selectByExample(CsExample example);

    Cs selectByPrimaryKey(Integer csid);

    int updateByExampleSelective(@Param("record") Cs record, @Param("example") CsExample example);

    int updateByExample(@Param("record") Cs record, @Param("example") CsExample example);

    int updateByPrimaryKeySelective(Cs record);

    int updateByPrimaryKey(Cs record);
}