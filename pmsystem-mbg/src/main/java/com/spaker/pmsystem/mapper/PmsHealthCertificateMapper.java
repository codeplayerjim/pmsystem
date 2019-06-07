package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsHealthCertificate;
import com.spaker.pmsystem.model.PmsHealthCertificateExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsHealthCertificateMapper {
    int countByExample(PmsHealthCertificateExample example);

    int deleteByExample(PmsHealthCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsHealthCertificate record);

    int insertSelective(PmsHealthCertificate record);

    List<PmsHealthCertificate> selectByExample(PmsHealthCertificateExample example);

    PmsHealthCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsHealthCertificate record, @Param("example") PmsHealthCertificateExample example);

    int updateByExample(@Param("record") PmsHealthCertificate record, @Param("example") PmsHealthCertificateExample example);

    int updateByPrimaryKeySelective(PmsHealthCertificate record);

    int updateByPrimaryKey(PmsHealthCertificate record);
}