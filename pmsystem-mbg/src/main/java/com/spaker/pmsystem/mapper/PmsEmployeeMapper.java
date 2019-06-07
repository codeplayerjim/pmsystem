package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsEmployee;
import com.spaker.pmsystem.model.PmsEmployeeExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsEmployeeMapper {
    int countByExample(PmsEmployeeExample example);

    int deleteByExample(PmsEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsEmployee record);

    int insertSelective(PmsEmployee record);

    List<PmsEmployee> selectByExample(PmsEmployeeExample example);

    PmsEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsEmployee record, @Param("example") PmsEmployeeExample example);

    int updateByExample(@Param("record") PmsEmployee record, @Param("example") PmsEmployeeExample example);

    int updateByPrimaryKeySelective(PmsEmployee record);

    int updateByPrimaryKey(PmsEmployee record);
}