package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsFamilyPlanningCertificate;
import com.spaker.pmsystem.model.PmsFamilyPlanningCertificateExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFamilyPlanningCertificateMapper {
    int countByExample(PmsFamilyPlanningCertificateExample example);

    int deleteByExample(PmsFamilyPlanningCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsFamilyPlanningCertificate record);

    int insertSelective(PmsFamilyPlanningCertificate record);

    List<PmsFamilyPlanningCertificate> selectByExample(PmsFamilyPlanningCertificateExample example);

    PmsFamilyPlanningCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsFamilyPlanningCertificate record, @Param("example") PmsFamilyPlanningCertificateExample example);

    int updateByExample(@Param("record") PmsFamilyPlanningCertificate record, @Param("example") PmsFamilyPlanningCertificateExample example);

    int updateByPrimaryKeySelective(PmsFamilyPlanningCertificate record);

    int updateByPrimaryKey(PmsFamilyPlanningCertificate record);
}