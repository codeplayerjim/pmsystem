package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsRewardsAndPunishments;
import com.spaker.pmsystem.model.PmsRewardsAndPunishmentsExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRewardsAndPunishmentsMapper {
    int countByExample(PmsRewardsAndPunishmentsExample example);

    int deleteByExample(PmsRewardsAndPunishmentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsRewardsAndPunishments record);

    int insertSelective(PmsRewardsAndPunishments record);

    List<PmsRewardsAndPunishments> selectByExample(PmsRewardsAndPunishmentsExample example);

    PmsRewardsAndPunishments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsRewardsAndPunishments record, @Param("example") PmsRewardsAndPunishmentsExample example);

    int updateByExample(@Param("record") PmsRewardsAndPunishments record, @Param("example") PmsRewardsAndPunishmentsExample example);

    int updateByPrimaryKeySelective(PmsRewardsAndPunishments record);

    int updateByPrimaryKey(PmsRewardsAndPunishments record);
}