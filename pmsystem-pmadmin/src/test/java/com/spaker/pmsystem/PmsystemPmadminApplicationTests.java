package com.spaker.pmsystem;

import com.spaker.pmsystem.controller.PmsEmployeeController;
import com.spaker.pmsystem.controller.PmsRetireEmployeeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsystemPmadminApplicationTests {

    @Autowired
    private PmsEmployeeController pmsEmployeeController;

    @Autowired
    private PmsRetireEmployeeController pmsRetireEmployeeController;

    @Test
    public void contextLoads()throws Exception {
        assertThat(pmsRetireEmployeeController).isNotNull();
    }

}
