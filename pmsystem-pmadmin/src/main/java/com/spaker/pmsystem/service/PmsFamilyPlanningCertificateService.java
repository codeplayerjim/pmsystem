package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsFamilyPlanningCertificateParam;
import com.spaker.pmsystem.model.PmsFamilyPlanningCertificate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DennisYao on 05,2019/5/17.
 */
public interface PmsFamilyPlanningCertificateService {
    List<PmsFamilyPlanningCertificate>listAllFamilyPlanningCertificate();

    int createFamilyPlanningCertificate(PmsFamilyPlanningCertificateParam PmsEmploeeParam);
    @Transactional
    int updateFamilyPlanningCertificate(int id,PmsFamilyPlanningCertificateParam PmsEmploeeParam);

    int deleteFamilyPlanningCertificate(int id);

    List<PmsFamilyPlanningCertificate> listFamilyPlanningCertificate(String household_register, int pageNum, int pageSize);

    PmsFamilyPlanningCertificate getFamilyPlanningCertificate(int id);
}
