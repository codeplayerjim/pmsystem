package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsEmergencyContactParam;
import com.spaker.pmsystem.mapper.PmsEmergencyContactMapper;
import com.spaker.pmsystem.model.PmsEmergencyContact;
import com.spaker.pmsystem.model.PmsEmergencyContactExample;
import com.spaker.pmsystem.service.PmsEmergencyContactService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by sunshine on 2019/4/18.
 */
@Service
public class PmsEmergencyContactServiceImpl implements PmsEmergencyContactService {

    @Autowired
    private PmsEmergencyContactMapper pmsEmergencyContactMapper;
    
    @Override
    public List<PmsEmergencyContact> listAllEmergencyContact() {
        return pmsEmergencyContactMapper.selectByExample(new PmsEmergencyContactExample());
    }

    @Override
    public int createEmergencyContact(PmsEmergencyContactParam pmsEmergencyContactParam) {
        PmsEmergencyContact pmsEmergencyContact=new PmsEmergencyContact();
        BeanUtils.copyProperties(pmsEmergencyContactParam,pmsEmergencyContact);
        return pmsEmergencyContactMapper.insertSelective(pmsEmergencyContact);
    }

    @Override
    public int updateEmergencyContact(int id, PmsEmergencyContactParam pmsEmergencyContactParam) {
        PmsEmergencyContact pmsEmergencyContact=new PmsEmergencyContact();
        BeanUtils.copyProperties(pmsEmergencyContactParam,pmsEmergencyContact);
        return pmsEmergencyContactMapper.updateByPrimaryKeySelective(pmsEmergencyContact);
    }

    @Override
    public int deleteEmergencyContact(int id) {
        return pmsEmergencyContactMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsEmergencyContact> listEmergencyContact(String name, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsEmergencyContactExample pmsSpouseExample=new PmsEmergencyContactExample();
        pmsSpouseExample.setOrderByClause("sort desc");
        PmsEmergencyContactExample.Criteria criteria=pmsSpouseExample.createCriteria();
        if(StringUtils.isEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        return pmsEmergencyContactMapper.selectByExample(pmsSpouseExample);
    }

    @Override
    public PmsEmergencyContact getEmergencyContact(int id) {
        return pmsEmergencyContactMapper.selectByPrimaryKey(id);
    }

    @Override
    public int importEmergencyContact(PmsEmergencyContact pmsEmergencyContact) {
        pmsEmergencyContact=new PmsEmergencyContact();
        return pmsEmergencyContactMapper.insert(pmsEmergencyContact);
    }
}
