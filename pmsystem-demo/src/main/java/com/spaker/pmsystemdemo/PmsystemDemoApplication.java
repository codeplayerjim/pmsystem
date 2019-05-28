package com.spaker.pmsystemdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spaker.pmsystem.mapper")
public class PmsystemDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsystemDemoApplication.class, args);
    }

}
