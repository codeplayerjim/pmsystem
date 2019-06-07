package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsRetireEmployeeParam;
import com.spaker.pmsystem.service.PmsRetireEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 退休人员service层
 * Created by sunshine on 2019/4/8.
 */
@Service
public class PmsRetireEmployeeServiceImpl implements PmsRetireEmployeeService {

    @Autowired
    private PmsRetireEmployeeMapper pmsRetireEmployeeMapper;

    @Override
    public List<PmsRetireEmployee> listAllEmployee() {
        return pmsRetireEmployeeMapper.selectByExample(new PmsRetireEmployeeExample());
    }

    @Override
    public int createEmployee(PmsRetireEmployeeParam pmsRetireEmployeeParam) {
        PmsRetireEmployee pmsRetireEmployee=new PmsRetireEmployee();
        BeanUtils.copyProperties(pmsRetireEmployeeParam,pmsRetireEmployee);
        return pmsRetireEmployeeMapper.insertSelective(pmsRetireEmployee);
    }

    @Override
    public int updateEmployee(int id, PmsRetireEmployeeParam pmsRetireEmployeeParam) {
        PmsRetireEmployee pmsRetireEmployee=new PmsRetireEmployee();
        BeanUtils.copyProperties(pmsRetireEmployeeParam,pmsRetireEmployee);
        pmsRetireEmployee.setId(id);
        return pmsRetireEmployeeMapper.updateByPrimaryKeySelective(pmsRetireEmployee);
    }

    @Override
    public int deleteEmployee(int id) {
        return pmsRetireEmployeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsRetireEmployee> listEmployee(String name, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsRetireEmployeeExample pmsRetireEmployeeExample=new PmsRetireEmployeeExample();
        PmsRetireEmployeeExample.Criteria criteria=pmsRetireEmployeeExample.createCriteria();
        if(StringUtils.isEmpty(name)){
            criteria.andNameLike("%"+name+"%");
        }
        pmsRetireEmployeeExample.setOrderByClause("sort desc");
        return pmsRetireEmployeeMapper.selectByExample(pmsRetireEmployeeExample);
    }

    @Override
    public PmsRetireEmployee getEmployee(int id) {
        return pmsRetireEmployeeMapper.selectByPrimaryKey(id);
    }
}
