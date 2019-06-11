package com.spaker.pmsystem.service.Impl;

import com.spaker.pmsystem.dto.PmsFreeOfChargeParam;
import com.spaker.pmsystem.model.PmsFreeOfCharge;
import com.spaker.pmsystem.service.PmsFreeOfChargeService;

import java.util.List;

/**
 * 免费伙食serivce
 * Create By DennisYao
 * 6/11/2019
 */
public class PmsFreeOfChargeServiceImpl implements PmsFreeOfChargeService {
    @Override
    public List<PmsFreeOfCharge> listAllCard() {
        return null;
    }

    @Override
    public int createCard(PmsFreeOfChargeParam PmsFreeOfChargeParam) {
        return 0;
    }

    @Override
    public int updateCard(int id, PmsFreeOfChargeParam PmsFreeOfChargeParam) {
        return 0;
    }

    @Override
    public int deleteCard(int id) {
        return 0;
    }

    @Override
    public List<PmsFreeOfCharge> listCard(String cardType, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsFreeOfCharge getCard(int id) {
        return null;
    }
}
