package com.spaker.pmsystem.ExcelIO;

import com.spaker.pmsystem.model.PmsEmergencyContact;
import com.spaker.pmsystem.service.PmsEmergencyContactService;
import com.spaker.pmsystem.util.ExcelUtil;
import com.spaker.pmsystem.vo.PmsEmergencyContactVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 2019/4/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImportTest {
    @Autowired
    private PmsEmergencyContactService pmsEmergencyContactService;

    @Test
    public void importExcel()throws Exception{
        FileInputStream inputStream=null;
        try {
            inputStream=new FileInputStream("d:\\success.xls");
            List<PmsEmergencyContact>list2=new ArrayList<PmsEmergencyContact>();
            ExcelUtil<PmsEmergencyContactVO>util=new ExcelUtil<PmsEmergencyContactVO>(PmsEmergencyContactVO.class);
            List<PmsEmergencyContactVO>list=util.importExcel("紧急联系人信息",inputStream);
            list2=convertVO2Eme(list);
            for(int i=0;i<list2.size();i++){
                pmsEmergencyContactService.importEmergencyContact(list2.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static List<PmsEmergencyContact>convertVO2Eme(List<PmsEmergencyContactVO>list){
        List<PmsEmergencyContact>list1=new ArrayList<PmsEmergencyContact>();
        for (int i=0;i<list.size();i++){
            PmsEmergencyContactVO pmsEmergencyContactVO=list.get(i);
            PmsEmergencyContact pmsEmergencyContact=new PmsEmergencyContact();
            pmsEmergencyContact.setId(pmsEmergencyContactVO.getId());
            pmsEmergencyContact.setName(pmsEmergencyContactVO.getName());
            pmsEmergencyContact.setPhone(pmsEmergencyContactVO.getPhone());
            list1.add(pmsEmergencyContact);
        }
        return list1;
    }
}
