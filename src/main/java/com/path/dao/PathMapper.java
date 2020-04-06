package com.path.dao;

import com.path.bean.Path;
import com.path.bean.PathExample;
import com.path.bean.Patient;
import com.path.bean.Rujingnew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathMapper {
    long countByExample(PathExample example);

    int deleteByExample(PathExample example);

    int deleteByPrimaryKey(Integer pathId);

    int insert(Path record);

    int insertSelective(Path record);

    List<Path> selectByExample(PathExample example);

    Path selectByPrimaryKey(Integer pathId);

    int updateByExampleSelective(@Param("record") Path record, @Param("example") PathExample example);

    int updateByExample(@Param("record") Path record, @Param("example") PathExample example);

    int updateByPrimaryKeySelective(Path record);

    int updateByPrimaryKey(Path record);

	List<Path> selectAlllujing();

	Path selectByuser(Path path);

	List<Path> selectByKey(Integer id);

	Path checkPath(Path path);

	void updatePath(Path path);

	List<Path> selectByInputValuePath(@Param("inputvalue")String inputvalue); 
}