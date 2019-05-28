package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsHealthCertificateParam;
import com.spaker.pmsystem.mapper.PmsHealthCertificateMapper;
import com.spaker.pmsystem.model.PmsHealthCertificate;
import com.spaker.pmsystem.model.PmsHealthCertificateExample;
import com.spaker.pmsystem.service.PmsHealthCertificateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 健康证service
 * Created by sunshine on 2019/5/13.
 */
@Service
public class PmsHealthCertificateServiceImpl implements PmsHealthCertificateService {

    @Autowired
    private PmsHealthCertificateMapper pmsHealthCertificateMapper;

    @Override
    public List<PmsHealthCertificate> listAllHealthCertificate() {
        return pmsHealthCertificateMapper.selectByExample(new PmsHealthCertificateExample());
    }

    @Override
    public int createHealthCertificate(PmsHealthCertificateParam pmsHealthCertificateParam) {
         PmsHealthCertificate  pmsHealthCertificate=new  PmsHealthCertificate();
        BeanUtils.copyProperties(pmsHealthCertificateParam, pmsHealthCertificate);
        return  pmsHealthCertificateMapper.insertSelective(pmsHealthCertificate);
    }

    @Override
    public int updateHealthCertificate(int id, PmsHealthCertificateParam pmsHealthCertificateParam) {
        PmsHealthCertificate pmsHealthCertificate=new PmsHealthCertificate();
        BeanUtils.copyProperties(pmsHealthCertificateParam, pmsHealthCertificate);
        return pmsHealthCertificateMapper.updateByPrimaryKeySelective(pmsHealthCertificate);
    }

    @Override
    public int deleteHealthCertificate(int id) {
        return pmsHealthCertificateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsHealthCertificate> listHealthCertificate(PmsHealthCertificateParam keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsHealthCertificateExample pmsHealthCertificateExample=new PmsHealthCertificateExample();
        pmsHealthCertificateExample.setOrderByClause("sort desc");
        PmsHealthCertificateExample.Criteria criteria=pmsHealthCertificateExample.createCriteria();
        return pmsHealthCertificateMapper.selectByExample(pmsHealthCertificateExample);
    }

    @Override
    public PmsHealthCertificate getHealthCertificate(int id) {
        return pmsHealthCertificateMapper.selectByPrimaryKey(id);
    }
}
