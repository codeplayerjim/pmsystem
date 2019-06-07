package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsProvidentFundPurchase;
import com.spaker.pmsystem.model.PmsProvidentFundPurchaseExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProvidentFundPurchaseMapper {
    int countByExample(PmsProvidentFundPurchaseExample example);

    int deleteByExample(PmsProvidentFundPurchaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProvidentFundPurchase record);

    int insertSelective(PmsProvidentFundPurchase record);

    List<PmsProvidentFundPurchase> selectByExample(PmsProvidentFundPurchaseExample example);

    PmsProvidentFundPurchase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProvidentFundPurchase record, @Param("example") PmsProvidentFundPurchaseExample example);

    int updateByExample(@Param("record") PmsProvidentFundPurchase record, @Param("example") PmsProvidentFundPurchaseExample example);

    int updateByPrimaryKeySelective(PmsProvidentFundPurchase record);

    int updateByPrimaryKey(PmsProvidentFundPurchase record);
}