package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsFamily;
import com.spaker.pmsystem.model.PmsFamilyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFamilyMapper {
    int countByExample(PmsFamilyExample example);

    int deleteByExample(PmsFamilyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsFamily record);

    int insertSelective(PmsFamily record);

    List<PmsFamily> selectByExample(PmsFamilyExample example);

    PmsFamily selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsFamily record, @Param("example") PmsFamilyExample example);

    int updateByExample(@Param("record") PmsFamily record, @Param("example") PmsFamilyExample example);

    int updateByPrimaryKeySelective(PmsFamily record);

    int updateByPrimaryKey(PmsFamily record);
}