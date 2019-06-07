package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsRetireEmployeeParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 退休人员
 * Created by sunshine on 2019/4/8.
 */
public interface PmsRetireEmployeeService {
    List<PmsRetireEmployee> listAllEmployee();

    int createEmployee(PmsRetireEmployeeParam PmsRetireEmployee);
    @Transactional
    int updateEmployee(int id,PmsRetireEmployeeParam PmsRetireEmployee);

    int deleteEmployee(int id);

    List<PmsRetireEmployee>listEmployee(String name,int pageNum,int pageSize);

    PmsRetireEmployee getEmployee(int id);
}
