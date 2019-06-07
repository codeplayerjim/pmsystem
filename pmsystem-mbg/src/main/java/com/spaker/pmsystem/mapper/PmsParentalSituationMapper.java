package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsParentalSituation;
import com.spaker.pmsystem.model.PmsParentalSituationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsParentalSituationMapper {
    int countByExample(PmsParentalSituationExample example);

    int deleteByExample(PmsParentalSituationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsParentalSituation record);

    int insertSelective(PmsParentalSituation record);

    List<PmsParentalSituation> selectByExample(PmsParentalSituationExample example);

    PmsParentalSituation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsParentalSituation record, @Param("example") PmsParentalSituationExample example);

    int updateByExample(@Param("record") PmsParentalSituation record, @Param("example") PmsParentalSituationExample example);

    int updateByPrimaryKeySelective(PmsParentalSituation record);

    int updateByPrimaryKey(PmsParentalSituation record);
}