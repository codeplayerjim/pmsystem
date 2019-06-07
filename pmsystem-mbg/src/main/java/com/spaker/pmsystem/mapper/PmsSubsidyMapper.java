package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsSubsidy;
import com.spaker.pmsystem.model.PmsSubsidyExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSubsidyMapper {
    int countByExample(PmsSubsidyExample example);

    int deleteByExample(PmsSubsidyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsSubsidy record);

    int insertSelective(PmsSubsidy record);

    List<PmsSubsidy> selectByExample(PmsSubsidyExample example);

    PmsSubsidy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsSubsidy record, @Param("example") PmsSubsidyExample example);

    int updateByExample(@Param("record") PmsSubsidy record, @Param("example") PmsSubsidyExample example);

    int updateByPrimaryKeySelective(PmsSubsidy record);

    int updateByPrimaryKey(PmsSubsidy record);
}