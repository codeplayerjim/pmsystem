package com.spaker.pmsystemdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsystemDemoApplicationTests {
    private Logger logger= LoggerFactory.getLogger(PmsystemDemoApplicationTests.class);
    @Test
    public void contextLoads() {
    }
    @Test
    public void testLogStash()throws Exception{
        ObjectMapper mapper=new ObjectMapper();
//        PmsProduct pmsProduct=new PmsProduct();
//        pmsProduct.setId(1L);
//        pmsProduct.setName("华为手机");
//        pmsProduct.setBrandName("华为");
//        logger.info(mapper.writeValueAsString(pmsProduct));
//        logger.error(mapper.writeValueAsString(pmsProduct));
    }

}
