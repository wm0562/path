package com.path.dao;

import com.path.bean.Deartment;
import com.path.bean.DeartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeartmentMapper {
    long countByExample(DeartmentExample example);

    int deleteByExample(DeartmentExample example);

    int deleteByPrimaryKey(Integer depId);

    int insert(Deartment record);

    int insertSelective(Deartment record);

    List<Deartment> selectByExample(DeartmentExample example);

    Deartment selectByPrimaryKey(Integer depId);

    int updateByExampleSelective(@Param("record") Deartment record, @Param("example") DeartmentExample example);

    int updateByExample(@Param("record") Deartment record, @Param("example") DeartmentExample example);

    int updateByPrimaryKeySelective(Deartment record);

    int updateByPrimaryKey(Deartment record);
}