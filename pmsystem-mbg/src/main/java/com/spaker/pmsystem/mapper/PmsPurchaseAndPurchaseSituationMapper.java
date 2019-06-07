package com.spaker.pmsystem.mapper;

import com.spaker.pmsystem.model.PmsPurchaseAndPurchaseSituation;
import com.spaker.pmsystem.model.PmsPurchaseAndPurchaseSituationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPurchaseAndPurchaseSituationMapper {
    int countByExample(PmsPurchaseAndPurchaseSituationExample example);

    int deleteByExample(PmsPurchaseAndPurchaseSituationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPurchaseAndPurchaseSituation record);

    int insertSelective(PmsPurchaseAndPurchaseSituation record);

    List<PmsPurchaseAndPurchaseSituation> selectByExample(PmsPurchaseAndPurchaseSituationExample example);

    PmsPurchaseAndPurchaseSituation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPurchaseAndPurchaseSituation record, @Param("example") PmsPurchaseAndPurchaseSituationExample example);

    int updateByExample(@Param("record") PmsPurchaseAndPurchaseSituation record, @Param("example") PmsPurchaseAndPurchaseSituationExample example);

    int updateByPrimaryKeySelective(PmsPurchaseAndPurchaseSituation record);

    int updateByPrimaryKey(PmsPurchaseAndPurchaseSituation record);
}