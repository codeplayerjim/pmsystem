package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsFreeOfChargeParam;
import com.spaker.pmsystem.mapper.PmsFreeOfChargeMapper;
import com.spaker.pmsystem.model.PmsFreeOfCharge;
import com.spaker.pmsystem.model.PmsFreeOfChargeExample;
import com.spaker.pmsystem.service.PmsFreeOfChargeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 免费伙食serivce
 * Create By DennisYao
 * 6/11/2019
 */
@Service
public class PmsFreeOfChargeServiceImpl implements PmsFreeOfChargeService {
    
    @Autowired
    private PmsFreeOfChargeMapper pmsFreeOfChargeMapper;
    
    @Override
    public List<PmsFreeOfCharge> listAllCard() {
        return pmsFreeOfChargeMapper.selectByExample(new PmsFreeOfChargeExample());
    }

    @Override
    public int createCard(PmsFreeOfChargeParam pmsFreeOfChargeParam) {
        PmsFreeOfCharge pmsFreeOfCharge=new PmsFreeOfCharge();
        BeanUtils.copyProperties(pmsFreeOfChargeParam,pmsFreeOfCharge);
        return pmsFreeOfChargeMapper.insertSelective(pmsFreeOfCharge);
    }

    @Override
    public int updateCard(int id, PmsFreeOfChargeParam pmsFreeOfChargeParam) {
        PmsFreeOfCharge pmsFreeOfCharge=new PmsFreeOfCharge();
        BeanUtils.copyProperties(pmsFreeOfChargeParam, pmsFreeOfCharge);
        return pmsFreeOfChargeMapper.updateByPrimaryKeySelective(pmsFreeOfCharge);
    }

    @Override
    public int deleteCard(int id) {
        return pmsFreeOfChargeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsFreeOfCharge> listCard(String cardType, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsFreeOfChargeExample pmsFreeOfChargeExample=new PmsFreeOfChargeExample();
        pmsFreeOfChargeExample.setOrderByClause("sort desc");
        PmsFreeOfChargeExample.Criteria criteria=pmsFreeOfChargeExample.createCriteria();
        if(StringUtils.isEmpty(cardType)){
            criteria.andCardtypeLike("%"+cardType+"%");
        }
        return pmsFreeOfChargeMapper.selectByExample(pmsFreeOfChargeExample);
    }

    @Override
    public PmsFreeOfCharge getCard(int id) {
        return pmsFreeOfChargeMapper.selectByPrimaryKey(id);
    }
}
