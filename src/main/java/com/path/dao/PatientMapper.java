package com.path.dao;

import com.path.bean.Doctor;
import com.path.bean.Patient;
import com.path.bean.PatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper {
    long countByExample(PatientExample example);

    int deleteByExample(PatientExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExample(PatientExample example);

    List<Patient> selectByPrimaryKey();

    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);
    
    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
    
    Patient selectByuser(Patient patient);

	List<Patient> selectByKey(Integer id);

	Patient checkPatient(Patient patient);

	void updatePatient(Patient patient);

	List<Patient> selectByInputValuePa(@Param("inputvalue")String inputvalue);
}