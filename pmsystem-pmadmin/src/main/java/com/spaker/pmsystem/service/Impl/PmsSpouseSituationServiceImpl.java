package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsSpouseSituationParam;
import com.spaker.pmsystem.mapper.PmsSpouseSituationMapper;
import com.spaker.pmsystem.model.PmsSpouseSituation;
import com.spaker.pmsystem.model.PmsSpouseSituationExample;
import com.spaker.pmsystem.service.PmsSpouseSituationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 配偶情况service
 * Created by sunshine on 2019/4/18.
 */
@Service
public class PmsSpouseSituationServiceImpl implements PmsSpouseSituationService {
    
    @Autowired
    private PmsSpouseSituationMapper pmsSpouseSituationMapper;
    
    @Override
    public List<PmsSpouseSituation> listAllSpouse() {
        return pmsSpouseSituationMapper.selectByExample(new PmsSpouseSituationExample());
    }

    @Override
    public int createSpouse(PmsSpouseSituationParam pmsSpouseSituationParam) {
        PmsSpouseSituation pmsSpouseSituation=new PmsSpouseSituation();
        BeanUtils.copyProperties(pmsSpouseSituationParam,pmsSpouseSituation);
        return pmsSpouseSituationMapper.insertSelective(pmsSpouseSituation);
    }

    @Override
    public int updateSpouse(int id, PmsSpouseSituationParam pmsSpouseSituationParam) {
        PmsSpouseSituation pmsSpouseSituation=new PmsSpouseSituation();
        BeanUtils.copyProperties(pmsSpouseSituationParam,pmsSpouseSituation);
        return pmsSpouseSituationMapper.updateByPrimaryKeySelective(pmsSpouseSituation);
    }

    @Override
    public int deleteSpouse(int id) {
        return pmsSpouseSituationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsSpouseSituation> listSpouse(PmsSpouseSituationParam keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsSpouseSituationExample pmsSpouseExample=new PmsSpouseSituationExample();
        pmsSpouseExample.setOrderByClause("sort desc");
        PmsSpouseSituationExample.Criteria criteria=pmsSpouseExample.createCriteria();
        if(StringUtils.isEmpty(keyword)){
            criteria.andNameLike("%"+keyword+"%");
        }
        return pmsSpouseSituationMapper.selectByExample(pmsSpouseExample);
    }

    @Override
    public PmsSpouseSituation getSpouse(int id) {
        return pmsSpouseSituationMapper.selectByPrimaryKey(id);
    }
}
