package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsWorkPermitProcessingRecord;
import com.spaker.pmsystem.model.PmsWorkPermitProcessingRecordExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsWorkPermitProcessingRecordMapper {
    int countByExample(PmsWorkPermitProcessingRecordExample example);

    int deleteByExample(PmsWorkPermitProcessingRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsWorkPermitProcessingRecord record);

    int insertSelective(PmsWorkPermitProcessingRecord record);

    List<PmsWorkPermitProcessingRecord> selectByExample(PmsWorkPermitProcessingRecordExample example);

    PmsWorkPermitProcessingRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsWorkPermitProcessingRecord record, @Param("example") PmsWorkPermitProcessingRecordExample example);

    int updateByExample(@Param("record") PmsWorkPermitProcessingRecord record, @Param("example") PmsWorkPermitProcessingRecordExample example);

    int updateByPrimaryKeySelective(PmsWorkPermitProcessingRecord record);

    int updateByPrimaryKey(PmsWorkPermitProcessingRecord record);
}