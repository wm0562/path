package com.path.dao;

import com.path.bean.Chujingnew;
import com.path.bean.Path;
import com.path.bean.Rujing;
import com.path.bean.RujingExample;
import com.path.bean.Rujingnew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RujingMapper {
    long countByExample(RujingExample example);

    int deleteByExample(RujingExample example);

    int deleteByPrimaryKey(Integer rujId);

    int insert(Rujing record);

    int insertSelective(Rujing record);

    List<Rujing> selectByExample(RujingExample example);

    Rujing selectByPrimaryKey(Integer rujId);

    int updateByExampleSelective(@Param("record") Rujing record, @Param("example") RujingExample example);

    int updateByExample(@Param("record") Rujing record, @Param("example") RujingExample example);

    int updateByPrimaryKeySelective(Rujing record);

    int updateByPrimaryKey(Rujing record);

	List<Rujingnew> getrujingnew();
	
	List<Rujingnew> selectByKey(Integer id);

	Rujingnew checkRujingnew(Rujingnew rujingnew);

	List<Rujingnew> selectByInputValueRuj(@Param("inputvalue")String inputvalue);
}