package com.spaker.pmsystem.service.Impl;


import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dto.PmsEmployeeParam;
import com.spaker.pmsystem.mapper.PmsEmployeeMapper;
import com.spaker.pmsystem.model.PmsEmployee;
import com.spaker.pmsystem.model.PmsEmployeeExample;
import com.spaker.pmsystem.service.PmsEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 在职员工service
 * Created by sunshine on 2019/3/24.
 */
@Service
public class PmsEmployeeServiceImpl implements PmsEmployeeService {
    @Autowired
    private PmsEmployeeMapper pmsEmployeeMapper;

    @Override
    public List<PmsEmployee> listAllEmployee() {
        return pmsEmployeeMapper.selectByExample(new PmsEmployeeExample());
    }

    @Override
    public int createEmployee(PmsEmployeeParam pmsEmployeeParam) {
        PmsEmployee pmsEmployee=new PmsEmployee();
        BeanUtils.copyProperties(pmsEmployeeParam,pmsEmployee);
        return pmsEmployeeMapper.insertSelective(pmsEmployee);
    }

    @Override
    public int updateEmployee(int id, PmsEmployeeParam pmsEmployeeParam) {
        PmsEmployee pmsEmployee=new PmsEmployee();
        BeanUtils.copyProperties(pmsEmployeeParam, pmsEmployee);
        return pmsEmployeeMapper.updateByPrimaryKeySelective(pmsEmployee);
    }

    @Override
    public int deleteEmployee(int id) {
        return pmsEmployeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsEmployee> listEmployee(PmsEmployeeParam keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsEmployeeExample pmsEmployeeExample=new PmsEmployeeExample();
        pmsEmployeeExample.setOrderByClause("sort desc");
        PmsEmployeeExample.Criteria criteria=pmsEmployeeExample.createCriteria();
        if(StringUtils.isEmpty(keyword)){
            criteria.andNameLike("%"+keyword+"%");
        }
        return pmsEmployeeMapper.selectByExample(pmsEmployeeExample);
    }

    @Override
    public PmsEmployee getEmployee(int id) {
        return pmsEmployeeMapper.selectByPrimaryKey(id);
    }



//    @Transactional(readOnly = false,rollbackFor = Exception.class)
//    @Override
//    public boolean batchImport(String fileName, MultipartFile file) throws Exception {
//        boolean notNull=false;
//        if(ExcelImportUrils.validateExcel(fileName)){
//            throw
//        }
//        if(ExcelImportUrils.isExcel2003(fileName))
//        return false;
//    }


}
