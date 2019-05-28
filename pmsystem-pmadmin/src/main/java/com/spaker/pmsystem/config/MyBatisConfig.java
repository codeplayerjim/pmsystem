package com.spaker.pmsystem.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis配置类
 * Created by sunshine on 2019/4/24.
 */
@EnableTransactionManagement
@MapperScan({"com.spaker.pmsystem.dao","com.spaker.pmsystem.mapper"})
@Configuration
public class MyBatisConfig {
}
