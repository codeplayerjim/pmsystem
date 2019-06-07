package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsBirthRecore;
import com.spaker.pmsystem.model.PmsBirthRecoreExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBirthRecoreMapper {
    int countByExample(PmsBirthRecoreExample example);

    int deleteByExample(PmsBirthRecoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsBirthRecore record);

    int insertSelective(PmsBirthRecore record);

    List<PmsBirthRecore> selectByExample(PmsBirthRecoreExample example);

    PmsBirthRecore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsBirthRecore record, @Param("example") PmsBirthRecoreExample example);

    int updateByExample(@Param("record") PmsBirthRecore record, @Param("example") PmsBirthRecoreExample example);

    int updateByPrimaryKeySelective(PmsBirthRecore record);

    int updateByPrimaryKey(PmsBirthRecore record);
}