package com.path.dao;

import com.path.bean.Chujing;
import com.path.bean.ChujingExample;
import com.path.bean.Chujingnew;
import com.path.bean.Rujingnew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChujingMapper {
    long countByExample(ChujingExample example);

    int deleteByExample(ChujingExample example);

    int deleteByPrimaryKey(Integer chujId);

    int insert(Chujing record);

    int insertSelective(Chujing record);

    List<Chujing> selectByExample(ChujingExample example);

    Chujing selectByPrimaryKey(Integer chujId);

    int updateByExampleSelective(@Param("record") Chujing record, @Param("example") ChujingExample example);

    int updateByExample(@Param("record") Chujing record, @Param("example") ChujingExample example);

    int updateByPrimaryKeySelective(Chujing record);

    int updateByPrimaryKey(Chujing record);

	List<Chujingnew> getchujingnew();
	
	List<Chujingnew> selectByKey(Integer id);
	
	Chujingnew checkChujingnew(Chujingnew chujingnew);

	List<Chujingnew> selectByInputValueChuj(@Param("inputvalue")String inputvalue);
}