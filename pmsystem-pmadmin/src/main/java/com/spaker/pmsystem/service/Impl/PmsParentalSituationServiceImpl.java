package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsParentalSituationParam;
import com.spaker.pmsystem.mapper.PmsParentalSituationMapper;
import com.spaker.pmsystem.model.PmsParentalSituation;
import com.spaker.pmsystem.model.PmsParentalSituationExample;
import com.spaker.pmsystem.service.PmsParentalSituationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 父母关系服务层
 * Created by sunshine on 2019/4/18.
 */
@Service
public class PmsParentalSituationServiceImpl implements PmsParentalSituationService {
    
    @Autowired
    private PmsParentalSituationMapper pmsParentalSituationMapper;
    
    @Override
    public List<PmsParentalSituation> listAllParental() {
        return pmsParentalSituationMapper.selectByExample(new PmsParentalSituationExample());
    }

    @Override
    public int createParental(PmsParentalSituationParam pmsParentalSituationParam) {
        PmsParentalSituation pmsParentalSituation=new PmsParentalSituation();
        BeanUtils.copyProperties(pmsParentalSituationParam,pmsParentalSituation);
        return pmsParentalSituationMapper.insertSelective(pmsParentalSituation);
    }

    @Override
    public int updateParental(int id, PmsParentalSituationParam pmsParentalSituationParam) {
        PmsParentalSituation pmsParentalSituation=new PmsParentalSituation();
        BeanUtils.copyProperties(pmsParentalSituationParam, pmsParentalSituation);
        return pmsParentalSituationMapper.updateByPrimaryKeySelective(pmsParentalSituation);
    }

    @Override
    public int deleteParental(int id) {
        return pmsParentalSituationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsParentalSituation> listParental(String name, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsParentalSituationExample pmsParentalExample=new PmsParentalSituationExample();
        pmsParentalExample.setOrderByClause("sort desc");
        PmsParentalSituationExample.Criteria criteria=pmsParentalExample.createCriteria();
        if(StringUtils.isEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        return pmsParentalSituationMapper.selectByExample(pmsParentalExample);
    }

    @Override
    public PmsParentalSituation getParental(int id) {
        return pmsParentalSituationMapper.selectByPrimaryKey(id);
    }
}
