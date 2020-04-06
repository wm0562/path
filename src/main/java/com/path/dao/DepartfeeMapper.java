package com.path.dao;

import com.path.bean.Departfee;
import com.path.bean.DepartfeeExample;
import com.path.bean.Departfeenew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartfeeMapper {
    long countByExample(DepartfeeExample example);

    int deleteByExample(DepartfeeExample example);

    int deleteByPrimaryKey(Integer departId);

    int insert(Departfee record);

    int insertSelective(Departfee record);

    List<Departfee> selectByExample(DepartfeeExample example);

    Departfee selectByPrimaryKey(Integer departId);

    int updateByExampleSelective(@Param("record") Departfee record, @Param("example") DepartfeeExample example);

    int updateByExample(@Param("record") Departfee record, @Param("example") DepartfeeExample example);

    int updateByPrimaryKeySelective(Departfee record);

    int updateByPrimaryKey(Departfee record);

	List<Departfeenew> getDepartmentFee(@Param("mid")Integer mid);
}