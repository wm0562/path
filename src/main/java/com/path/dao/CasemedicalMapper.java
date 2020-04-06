package com.path.dao;

import com.path.bean.CaseMedicalnew;
import com.path.bean.Casemedical;
import com.path.bean.CasemedicalExample;
import com.path.bean.Gzltj;
import com.path.bean.Ljtj;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CasemedicalMapper {
    long countByExample(CasemedicalExample example);

    int deleteByExample(CasemedicalExample example);

    int deleteByPrimaryKey(Integer caseId);

    int insert(Casemedical record);

    int insertSelective(Casemedical record);

    List<Casemedical> selectByExample(CasemedicalExample example);

    Casemedical selectByPrimaryKey(Integer caseId);

    int updateByExampleSelective(@Param("record") Casemedical record, @Param("example") CasemedicalExample example);

    int updateByExample(@Param("record") Casemedical record, @Param("example") CasemedicalExample example);

    int updateByPrimaryKeySelective(Casemedical record);

    int updateByPrimaryKey(Casemedical record);

	List<CaseMedicalnew> getMedicalSimple(@Param("mid")Integer mid);

	List<Ljtj> getlujingtongji(@Param("newinputvalue")String newinputvalue);

	List<Gzltj> getgongzuoliang(@Param("newinputvalue")String newinputvalue);
}