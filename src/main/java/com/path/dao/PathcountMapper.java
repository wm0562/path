package com.path.dao;

import com.path.bean.Pathcount;
import com.path.bean.PathcountExample;
import com.path.bean.Pathcountnew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathcountMapper {
    long countByExample(PathcountExample example);

    int deleteByExample(PathcountExample example);

    int deleteByPrimaryKey(String pathId);

    int insert(Pathcount record);

    int insertSelective(Pathcount record);

    List<Pathcount> selectByExample(PathcountExample example);

    Pathcount selectByPrimaryKey(String pathId);

    int updateByExampleSelective(@Param("record") Pathcount record, @Param("example") PathcountExample example);

    int updateByExample(@Param("record") Pathcount record, @Param("example") PathcountExample example);

    int updateByPrimaryKeySelective(Pathcount record);

    int updateByPrimaryKey(Pathcount record);
    
    List<Pathcountnew> getpathcountnew();
	
	List<Pathcountnew> selectByKey(Integer id);

	Pathcountnew checkpathcountnew(Pathcountnew pathcountnew);

	List<Pathcountnew> selectByInputValuePac(@Param("inputvalue")String inputvalue);

	List<Pathcountnew> getfeiyong(@Param("newinputvalue")String newinputvalue);
}