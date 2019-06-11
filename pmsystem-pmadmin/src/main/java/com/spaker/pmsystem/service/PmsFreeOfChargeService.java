package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsFreeOfChargeParam;
import com.spaker.pmsystem.model.PmsFreeOfCharge;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 免费伙食
 * Create By DennisYao
 * 6/11/2019
 */
public interface PmsFreeOfChargeService {
    List<PmsFreeOfCharge> listAllCard();

    int createCard(PmsFreeOfChargeParam PmsFreeOfChargeParam);
    @Transactional
    int updateCard(int id,PmsFreeOfChargeParam PmsFreeOfChargeParam);

    int deleteCard(int id);

    List<PmsFreeOfCharge>listCard(String cardType, int pageNum, int pageSize);

    PmsFreeOfCharge getCard(int id);
}
