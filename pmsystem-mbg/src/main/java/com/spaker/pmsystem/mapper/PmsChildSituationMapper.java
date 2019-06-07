package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsChildSituation;
import com.spaker.pmsystem.model.PmsChildSituationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsChildSituationMapper {
    int countByExample(PmsChildSituationExample example);

    int deleteByExample(PmsChildSituationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsChildSituation record);

    int insertSelective(PmsChildSituation record);

    List<PmsChildSituation> selectByExample(PmsChildSituationExample example);

    PmsChildSituation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsChildSituation record, @Param("example") PmsChildSituationExample example);

    int updateByExample(@Param("record") PmsChildSituation record, @Param("example") PmsChildSituationExample example);

    int updateByPrimaryKeySelective(PmsChildSituation record);

    int updateByPrimaryKey(PmsChildSituation record);
}