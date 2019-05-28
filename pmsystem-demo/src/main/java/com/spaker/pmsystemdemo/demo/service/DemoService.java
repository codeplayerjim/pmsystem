package com.spaker.pmsystemdemo.demo.service;

import com.spaker.pmsystem.model.PmsBrand;
import com.spaker.pmsystemdemo.demo.dto.PmsBrandDto;

import java.util.List;

public interface DemoService {
    List<PmsBrand>listAllBrand();

    int createBrand(PmsBrandDto pmsBrandDto);

    int updateBrand(Long id,PmsBrandDto pmsBrandDto);

    int deleteBrand(Long id);

    List<PmsBrand>listBrand(int pageNum,int pageSize);

    PmsBrand getBrand(Long id);
}
