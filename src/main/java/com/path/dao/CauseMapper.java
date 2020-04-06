package com.path.dao;

import com.path.bean.Cause;
import com.path.bean.CauseExample;
import com.path.bean.Causenew;
import com.path.bean.Pathtimeoutnew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CauseMapper {
    long countByExample(CauseExample example);

    int deleteByExample(CauseExample example);

    int deleteByPrimaryKey(Integer causeId);

    int insert(Cause record);

    int insertSelective(Cause record);

    List<Cause> selectByExample(CauseExample example);

    Cause selectByPrimaryKey(Integer causeId);

    int updateByExampleSelective(@Param("record") Cause record, @Param("example") CauseExample example);

    int updateByExample(@Param("record") Cause record, @Param("example") CauseExample example);

    int updateByPrimaryKeySelective(Cause record);

    int updateByPrimaryKey(Cause record);
    
    List<Causenew> getcause();
	
	List<Causenew> selectByKey(Integer id);

	Causenew checkCause(Causenew causenew);

	List<Causenew> selectByInputValueCau(@Param("inputvalue")String inputvalue);
}