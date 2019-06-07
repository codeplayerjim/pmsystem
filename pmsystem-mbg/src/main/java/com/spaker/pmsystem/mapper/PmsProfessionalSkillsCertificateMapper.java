package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsProfessionalSkillsCertificate;
import com.spaker.pmsystem.model.PmsProfessionalSkillsCertificateExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProfessionalSkillsCertificateMapper {
    int countByExample(PmsProfessionalSkillsCertificateExample example);

    int deleteByExample(PmsProfessionalSkillsCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProfessionalSkillsCertificate record);

    int insertSelective(PmsProfessionalSkillsCertificate record);

    List<PmsProfessionalSkillsCertificate> selectByExample(PmsProfessionalSkillsCertificateExample example);

    PmsProfessionalSkillsCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProfessionalSkillsCertificate record, @Param("example") PmsProfessionalSkillsCertificateExample example);

    int updateByExample(@Param("record") PmsProfessionalSkillsCertificate record, @Param("example") PmsProfessionalSkillsCertificateExample example);

    int updateByPrimaryKeySelective(PmsProfessionalSkillsCertificate record);

    int updateByPrimaryKey(PmsProfessionalSkillsCertificate record);
}