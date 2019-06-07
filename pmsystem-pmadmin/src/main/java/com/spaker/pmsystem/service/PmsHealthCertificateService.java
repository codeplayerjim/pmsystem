package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsHealthCertificateParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sunshine on 2019/5/13.
 */
public interface PmsHealthCertificateService {

    List<PmsHealthCertificate>listAllHealthCertificate();

    int createHealthCertificate(PmsHealthCertificateParam PmsEmploeeParam);
    @Transactional
    int updateHealthCertificate(int id, PmsHealthCertificateParam PmsEmploeeParam);

    int deleteHealthCertificate(int id);

    List<PmsHealthCertificate> listHealthCertificate(String institution, int pageNum, int pageSize);

     PmsHealthCertificate getHealthCertificate(int id);
}
