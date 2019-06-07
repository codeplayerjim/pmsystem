package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsFreeOfCharge;
import com.spaker.pmsystem.model.PmsFreeOfChargeExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFreeOfChargeMapper {
    int countByExample(PmsFreeOfChargeExample example);

    int deleteByExample(PmsFreeOfChargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsFreeOfCharge record);

    int insertSelective(PmsFreeOfCharge record);

    List<PmsFreeOfCharge> selectByExample(PmsFreeOfChargeExample example);

    PmsFreeOfCharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsFreeOfCharge record, @Param("example") PmsFreeOfChargeExample example);

    int updateByExample(@Param("record") PmsFreeOfCharge record, @Param("example") PmsFreeOfChargeExample example);

    int updateByPrimaryKeySelective(PmsFreeOfCharge record);

    int updateByPrimaryKey(PmsFreeOfCharge record);
}