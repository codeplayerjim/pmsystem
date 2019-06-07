package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsEmergencyContact;
import com.spaker.pmsystem.model.PmsEmergencyContactExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsEmergencyContactMapper {
    int countByExample(PmsEmergencyContactExample example);

    int deleteByExample(PmsEmergencyContactExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsEmergencyContact record);

    int insertSelective(PmsEmergencyContact record);

    List<PmsEmergencyContact> selectByExample(PmsEmergencyContactExample example);

    PmsEmergencyContact selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsEmergencyContact record, @Param("example") PmsEmergencyContactExample example);

    int updateByExample(@Param("record") PmsEmergencyContact record, @Param("example") PmsEmergencyContactExample example);

    int updateByPrimaryKeySelective(PmsEmergencyContact record);

    int updateByPrimaryKey(PmsEmergencyContact record);
}