package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsEmergencyContactParam;
import com.spaker.pmsystem.model.PmsEmergencyContact;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sunshine on 2019/4/18.
 */
public interface PmsEmergencyContactService {
    List<PmsEmergencyContact> listAllEmergencyContact();

    int createEmergencyContact(PmsEmergencyContactParam PmsEmploeeParam);
    @Transactional
    int updateEmergencyContact(int id,PmsEmergencyContactParam PmsEmploeeParam);

    int deleteEmergencyContact(int id);

    List<PmsEmergencyContact>listEmergencyContact(String name, int pageNum, int pageSize);

    PmsEmergencyContact getEmergencyContact(int id);

    int importEmergencyContact(PmsEmergencyContact pmsEmergencyContact);
}
