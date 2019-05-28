package com.spaker.pmsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication
public class PmsystemPmadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsystemPmadminApplication.class, args);
    }

}
