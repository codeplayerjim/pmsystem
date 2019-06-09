package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsParentalSituationParam;
import com.spaker.pmsystem.model.PmsParentalSituation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sunshine on 2019/4/18.
 */
public interface PmsParentalSituationService {
    List<PmsParentalSituation> listAllParental();

    int createParental(PmsParentalSituationParam PmsEmploeeParam);
    @Transactional
    int updateParental(int id,PmsParentalSituationParam PmsEmploeeParam);

    int deleteParental(int id);

    List<PmsParentalSituation>listParental(String name, int pageNum, int pageSize);

    PmsParentalSituation getParental(int id);
}
