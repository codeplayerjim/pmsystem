package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsContractSigning;
import com.spaker.pmsystem.model.PmsContractSigningExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsContractSigningMapper {
    int countByExample(PmsContractSigningExample example);

    int deleteByExample(PmsContractSigningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsContractSigning record);

    int insertSelective(PmsContractSigning record);

    List<PmsContractSigning> selectByExample(PmsContractSigningExample example);

    PmsContractSigning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsContractSigning record, @Param("example") PmsContractSigningExample example);

    int updateByExample(@Param("record") PmsContractSigning record, @Param("example") PmsContractSigningExample example);

    int updateByPrimaryKeySelective(PmsContractSigning record);

    int updateByPrimaryKey(PmsContractSigning record);
}