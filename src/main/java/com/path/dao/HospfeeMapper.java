package com.path.dao;

import com.path.bean.Hospfee;
import com.path.bean.HospfeeExample;
import com.path.bean.Hospfeenew;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospfeeMapper {
    long countByExample(HospfeeExample example);

    int deleteByExample(HospfeeExample example);

    int deleteByPrimaryKey(Integer hosId);

    int insert(Hospfee record);

    int insertSelective(Hospfee record);

    List<Hospfee> selectByExample(HospfeeExample example);

    Hospfee selectByPrimaryKey(Integer hosId);

    int updateByExampleSelective(@Param("record") Hospfee record, @Param("example") HospfeeExample example);

    int updateByExample(@Param("record") Hospfee record, @Param("example") HospfeeExample example);

    int updateByPrimaryKeySelective(Hospfee record);

    int updateByPrimaryKey(Hospfee record);

	List<Hospfeenew> getHospFee(@Param("mid")Integer mid);
}