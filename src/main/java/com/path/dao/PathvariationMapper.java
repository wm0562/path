package com.path.dao;

import com.path.bean.Pathvariation;
import com.path.bean.PathvariationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathvariationMapper {
    long countByExample(PathvariationExample example);

    int deleteByExample(PathvariationExample example);

    int deleteByPrimaryKey(Integer variationId);

    int insert(Pathvariation record);

    int insertSelective(Pathvariation record);

    List<Pathvariation> selectByExample(PathvariationExample example);

    Pathvariation selectByPrimaryKey(Integer variationId);

    int updateByExampleSelective(@Param("record") Pathvariation record, @Param("example") PathvariationExample example);

    int updateByExample(@Param("record") Pathvariation record, @Param("example") PathvariationExample example);

    int updateByPrimaryKeySelective(Pathvariation record);

    int updateByPrimaryKey(Pathvariation record);
}