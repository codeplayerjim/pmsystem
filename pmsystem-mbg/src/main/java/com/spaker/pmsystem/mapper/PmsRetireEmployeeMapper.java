package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsRetireEmployee;
import com.spaker.pmsystem.model.PmsRetireEmployeeExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRetireEmployeeMapper {
    int countByExample(PmsRetireEmployeeExample example);

    int deleteByExample(PmsRetireEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsRetireEmployee record);

    int insertSelective(PmsRetireEmployee record);

    List<PmsRetireEmployee> selectByExample(PmsRetireEmployeeExample example);

    PmsRetireEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsRetireEmployee record, @Param("example") PmsRetireEmployeeExample example);

    int updateByExample(@Param("record") PmsRetireEmployee record, @Param("example") PmsRetireEmployeeExample example);

    int updateByPrimaryKeySelective(PmsRetireEmployee record);

    int updateByPrimaryKey(PmsRetireEmployee record);
}