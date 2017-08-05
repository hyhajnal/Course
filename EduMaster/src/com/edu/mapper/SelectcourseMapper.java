package com.edu.mapper;

import com.edu.po.Selectcourse;
import com.edu.po.SelectcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectcourseMapper {
    int countByExample(SelectcourseExample example);

    int deleteByExample(SelectcourseExample example);

    int deleteByPrimaryKey(Integer scnum);

    int insert(Selectcourse record);

    int insertSelective(Selectcourse record);

    List<Selectcourse> selectByExample(SelectcourseExample example);

    Selectcourse selectByPrimaryKey(Integer scnum);

    int updateByExampleSelective(@Param("record") Selectcourse record, @Param("example") SelectcourseExample example);

    int updateByExample(@Param("record") Selectcourse record, @Param("example") SelectcourseExample example);

    int updateByPrimaryKeySelective(Selectcourse record);

    int updateByPrimaryKey(Selectcourse record);
}