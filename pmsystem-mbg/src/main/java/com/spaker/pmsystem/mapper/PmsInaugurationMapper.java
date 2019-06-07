package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsInauguration;
import com.spaker.pmsystem.model.PmsInaugurationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsInaugurationMapper {
    int countByExample(PmsInaugurationExample example);

    int deleteByExample(PmsInaugurationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsInauguration record);

    int insertSelective(PmsInauguration record);

    List<PmsInauguration> selectByExample(PmsInaugurationExample example);

    PmsInauguration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsInauguration record, @Param("example") PmsInaugurationExample example);

    int updateByExample(@Param("record") PmsInauguration record, @Param("example") PmsInaugurationExample example);

    int updateByPrimaryKeySelective(PmsInauguration record);

    int updateByPrimaryKey(PmsInauguration record);
}