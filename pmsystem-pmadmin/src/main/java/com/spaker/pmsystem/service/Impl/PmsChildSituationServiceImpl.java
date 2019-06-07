package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsChildSituationParam;
import com.spaker.pmsystem.service.PmsChildSituationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 子女情况服务层
 * Created by sunshine on 2019/4/16.
 */
@Service
public class PmsChildSituationServiceImpl implements PmsChildSituationService {
    @Autowired
    private PmsChildSituationMapper pmsChildSituationMapper;

    @Override
    public List<PmsChildSituation> listAllChildren() {
        return pmsChildSituationMapper.selectByExample(new PmsChildSituationExample());
    }

    @Override
    public int createChildren(PmsChildSituationParam pmsChildSituationParam) {
        PmsChildSituation pmsChildSituation=new PmsChildSituation();
        BeanUtils.copyProperties(pmsChildSituationParam,pmsChildSituation);
        return pmsChildSituationMapper.insertSelective(pmsChildSituation);
    }

    @Override
    public int updateChildren(int id, PmsChildSituationParam pmsChildSituationParam) {
        PmsChildSituation pmsChildSituation=new PmsChildSituation();
        BeanUtils.copyProperties(pmsChildSituationParam,pmsChildSituation);
        return pmsChildSituationMapper.updateByPrimaryKeySelective(pmsChildSituation);
    }

    @Override
    public int deleteChildren(int id) {
        return pmsChildSituationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsChildSituation> listChildren(String name,
                                                int pageNum,
                                                int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsChildSituationExample pmsChildSituationExample=new PmsChildSituationExample();
        pmsChildSituationExample.setOrderByClause("sort desc");
        PmsChildSituationExample.Criteria criteria=pmsChildSituationExample.createCriteria();
        if(!StringUtils.isEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        return pmsChildSituationMapper.selectByExample(pmsChildSituationExample);
    }

    @Override
    public PmsChildSituation getChildren(int id) {
        return pmsChildSituationMapper.selectByPrimaryKey(id);
    }
}
