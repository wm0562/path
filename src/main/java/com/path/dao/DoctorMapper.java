package com.path.dao;

import com.path.bean.Doctor;
import com.path.bean.DoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    long countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    List<Doctor> selectByPrimaryKey(DoctorExample example);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

	Doctor selectByuser(Doctor doctor);

	List<Doctor> selectByKey(Integer id);

	Doctor checkDoctor(Doctor doctor);

	void updateDoctor(Doctor doctor);

	List<Doctor> selectByInputValue(@Param("inputvalue")String inputvalue);
}