package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsFamilyPlanningCertificateParam;
import com.spaker.pmsystem.mapper.PmsFamilyPlanningCertificateMapper;
import com.spaker.pmsystem.model.PmsFamilyPlanningCertificateExample;
import com.spaker.pmsystem.model.PmsFamilyPlanningCertificate;
import com.spaker.pmsystem.service.PmsFamilyPlanningCertificateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 家庭成员service
 * Created by DennisYao on 05,2019/5/17.
 */
@Service
public class PmsFamilyPlanningCertificateServiceImpl implements PmsFamilyPlanningCertificateService {
    
    @Autowired
    private PmsFamilyPlanningCertificateMapper pmsFamilyPlanningCertificateMapper;
    
    @Override
    public List<PmsFamilyPlanningCertificate> listAllFamilyPlanningCertificate() {
        return pmsFamilyPlanningCertificateMapper.selectByExample(new PmsFamilyPlanningCertificateExample());
    }

    @Override
    public int createFamilyPlanningCertificate(PmsFamilyPlanningCertificateParam PmsFamilyPlanningCertificateParam) {
        PmsFamilyPlanningCertificate PmsFamilyPlanningCertificate=new PmsFamilyPlanningCertificate();
        BeanUtils.copyProperties(PmsFamilyPlanningCertificateParam,PmsFamilyPlanningCertificate);
        return pmsFamilyPlanningCertificateMapper.insertSelective(PmsFamilyPlanningCertificate);
    }

    @Override
    public int updateFamilyPlanningCertificate(int id, PmsFamilyPlanningCertificateParam PmsFamilyPlanningCertificateParam) {
        PmsFamilyPlanningCertificate PmsFamilyPlanningCertificate=new PmsFamilyPlanningCertificate();
        BeanUtils.copyProperties(PmsFamilyPlanningCertificateParam, PmsFamilyPlanningCertificate);
        return pmsFamilyPlanningCertificateMapper.updateByPrimaryKeySelective(PmsFamilyPlanningCertificate);
    }

    @Override
    public int deleteFamilyPlanningCertificate(int id) {
        return pmsFamilyPlanningCertificateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsFamilyPlanningCertificate> listFamilyPlanningCertificate(PmsFamilyPlanningCertificateParam keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsFamilyPlanningCertificateExample PmsFamilyPlanningCertificateExample=new PmsFamilyPlanningCertificateExample();
        PmsFamilyPlanningCertificateExample.setOrderByClause("sort desc");
        PmsFamilyPlanningCertificateExample.Criteria criteria=PmsFamilyPlanningCertificateExample.createCriteria();
        if(StringUtils.isEmpty(keyword)){
            criteria.andDepartmentContactLike("%"+keyword+"%");
        }
        return pmsFamilyPlanningCertificateMapper.selectByExample(PmsFamilyPlanningCertificateExample);
    }

    @Override
    public PmsFamilyPlanningCertificate getFamilyPlanningCertificate(int id) {
        return pmsFamilyPlanningCertificateMapper.selectByPrimaryKey(id);
    }
}
