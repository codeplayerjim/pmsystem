package com.spaker.pmsystem.ExcelIO;

import com.spaker.pmsystem.controller.PmsEmergencyContactController;
import com.spaker.pmsystem.dto.PmsEmergencyContactParam;
import com.spaker.pmsystem.model.PmsEmergencyContact;
import com.spaker.pmsystem.service.PmsEmergencyContactService;
import com.spaker.pmsystem.util.ExcelUtil;
import com.spaker.pmsystem.vo.PmsEmergencyContactVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunshine on 2019/4/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExportTest {
    @Autowired
    private PmsEmergencyContactService pmsEmergencyContactService;

    @Test
    public void export()throws Exception{
        List<PmsEmergencyContact>pmsEmergencyContactList=new ArrayList<PmsEmergencyContact>();
        pmsEmergencyContactList=pmsEmergencyContactService.listAllEmergencyContact();
//        pmsEmergencyContactList.add(pmsEmergencyContactService.getEmergencyContact(1));

        FileOutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream("d:\\success.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ExcelUtil<PmsEmergencyContactVO>util=new ExcelUtil<PmsEmergencyContactVO>(PmsEmergencyContactVO.class);
        util.exportExcel(convertEme2VO(pmsEmergencyContactList),"紧急联系人信息",65536,outputStream);
        System.out.println("执行完毕");
    }

    private static List<PmsEmergencyContactVO>convertEme2VO(List<PmsEmergencyContact>list){
        List<PmsEmergencyContactVO>list1=new ArrayList<PmsEmergencyContactVO>();
        for (int i=0;i<list.size();i++){
            PmsEmergencyContactVO pmsEmergencyContactVO=new PmsEmergencyContactVO();
            PmsEmergencyContact pmsEmergencyContact=list.get(i);
            pmsEmergencyContactVO.setName(pmsEmergencyContact.getName());
            pmsEmergencyContactVO.setId(pmsEmergencyContact.getId());
            pmsEmergencyContactVO.setPhone(pmsEmergencyContact.getPhone());
            list1.add(pmsEmergencyContactVO);

        }
        return list1;
    }

    }



