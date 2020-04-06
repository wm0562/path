package com.path.dao;

import com.path.bean.Pathcountnew;
import com.path.bean.Pathtimeout;
import com.path.bean.PathtimeoutExample;
import com.path.bean.Pathtimeoutnew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathtimeoutMapper {
    long countByExample(PathtimeoutExample example);

    int deleteByExample(PathtimeoutExample example);

    int deleteByPrimaryKey(Integer timeoutId);

    int insert(Pathtimeout record);

    int insertSelective(Pathtimeout record);

    List<Pathtimeout> selectByExample(PathtimeoutExample example);

    Pathtimeout selectByPrimaryKey(Integer timeoutId);

    int updateByExampleSelective(@Param("record") Pathtimeout record, @Param("example") PathtimeoutExample example);

    int updateByExample(@Param("record") Pathtimeout record, @Param("example") PathtimeoutExample example);

    int updateByPrimaryKeySelective(Pathtimeout record);

    int updateByPrimaryKey(Pathtimeout record);
    
    List<Pathtimeoutnew> getljchaoshi();
	
	List<Pathtimeoutnew> selectByKey(Integer id);

	Pathtimeoutnew checkLjchaoshi(Pathtimeoutnew pathtimeoutnew);

	List<Pathtimeoutnew> selectByInputValuePat(@Param("inputvalue")String inputvalue);
}