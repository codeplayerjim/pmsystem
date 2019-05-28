package com.spaker.pmsystem.service;


import com.spaker.pmsystem.dto.PmsChildSituationParam;
import com.spaker.pmsystem.model.PmsChildSituation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 子女关系
 * Created by sunshine on 2019/4/16.
 */
public interface PmsChildSituationService {
    List<PmsChildSituation> listAllChildren();

    int createChildren(PmsChildSituationParam pmsChildSituationParam);
    @Transactional
    int updateChildren(int id, PmsChildSituationParam pmsChildSituationParam);

    int deleteChildren(int id);

    List<PmsChildSituation>listChildren(PmsChildSituationParam keyword, int pageNum, int pageSize);

    PmsChildSituation getChildren(int id);
}
