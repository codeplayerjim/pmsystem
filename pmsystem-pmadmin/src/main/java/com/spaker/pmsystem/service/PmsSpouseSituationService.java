package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsSpouseSituationParam;
import com.spaker.pmsystem.model.PmsSpouseSituation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sunshine on 2019/4/18.
 */
public interface PmsSpouseSituationService {
    List<PmsSpouseSituation> listAllSpouse();

    int createSpouse(PmsSpouseSituationParam PmsEmploeeParam);
    @Transactional
    int updateSpouse(int id,PmsSpouseSituationParam PmsEmploeeParam);

    int deleteSpouse(int id);

    List<PmsSpouseSituation>listSpouse(String name, int pageNum, int pageSize);

    PmsSpouseSituation getSpouse(int id);
}
