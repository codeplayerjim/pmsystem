package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsTraining;
import com.spaker.pmsystem.model.PmsTrainingExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsTrainingMapper {
    int countByExample(PmsTrainingExample example);

    int deleteByExample(PmsTrainingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsTraining record);

    int insertSelective(PmsTraining record);

    List<PmsTraining> selectByExample(PmsTrainingExample example);

    PmsTraining selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsTraining record, @Param("example") PmsTrainingExample example);

    int updateByExample(@Param("record") PmsTraining record, @Param("example") PmsTrainingExample example);

    int updateByPrimaryKeySelective(PmsTraining record);

    int updateByPrimaryKey(PmsTraining record);
}