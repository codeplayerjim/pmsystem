package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsSpouseSituation;
import com.spaker.pmsystem.model.PmsSpouseSituationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSpouseSituationMapper {
    int countByExample(PmsSpouseSituationExample example);

    int deleteByExample(PmsSpouseSituationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsSpouseSituation record);

    int insertSelective(PmsSpouseSituation record);

    List<PmsSpouseSituation> selectByExample(PmsSpouseSituationExample example);

    PmsSpouseSituation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsSpouseSituation record, @Param("example") PmsSpouseSituationExample example);

    int updateByExample(@Param("record") PmsSpouseSituation record, @Param("example") PmsSpouseSituationExample example);

    int updateByPrimaryKeySelective(PmsSpouseSituation record);

    int updateByPrimaryKey(PmsSpouseSituation record);
}