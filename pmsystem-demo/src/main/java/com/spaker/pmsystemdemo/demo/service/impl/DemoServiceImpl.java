package com.spaker.pmsystemdemo.demo.service.impl;


import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.mapper.PmsBrandMapper;
import com.spaker.pmsystem.model.PmsBrand;
import com.spaker.pmsystem.model.PmsBrandExample;
import com.spaker.pmsystemdemo.demo.dto.PmsBrandDto;
import com.spaker.pmsystemdemo.demo.service.DemoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    PmsBrandMapper pmsBrandMapper;
    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand=new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto,pmsBrand);
        return pmsBrandMapper.insertSelective(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand =new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto,pmsBrand);
        pmsBrand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
