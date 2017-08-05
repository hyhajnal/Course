package com.edu.mapper;

import com.edu.po.Operation;
import com.edu.po.OperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationMapper {
    int countByExample(OperationExample example);

    int deleteByExample(OperationExample example);

    int insert(Operation record);

    int insertSelective(Operation record);

    List<Operation> selectByExample(OperationExample example);

    int updateByExampleSelective(@Param("record") Operation record, @Param("example") OperationExample example);

    int updateByExample(@Param("record") Operation record, @Param("example") OperationExample example);
}