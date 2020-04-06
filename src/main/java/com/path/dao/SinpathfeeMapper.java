package com.path.dao;

import com.path.bean.Sinpathfee;
import com.path.bean.SinpathfeeExample;
import com.path.bean.Sinpathfeenew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SinpathfeeMapper {
    long countByExample(SinpathfeeExample example);

    int deleteByExample(SinpathfeeExample example);

    int deleteByPrimaryKey(Integer pathfeeId);

    int insert(Sinpathfee record);

    int insertSelective(Sinpathfee record);

    List<Sinpathfee> selectByExample(SinpathfeeExample example);

    Sinpathfee selectByPrimaryKey(Integer pathfeeId);

    int updateByExampleSelective(@Param("record") Sinpathfee record, @Param("example") SinpathfeeExample example);

    int updateByExample(@Param("record") Sinpathfee record, @Param("example") SinpathfeeExample example);

    int updateByPrimaryKeySelective(Sinpathfee record);

    int updateByPrimaryKey(Sinpathfee record);

	List<Sinpathfeenew> getSinPathFee(@Param("mid")Integer mid);
}