# pmsystem

## 项目介绍

`pmsystem`项目是人事管理系统，是一个后台管理系统，基于SpringBoot+MyBatis实现。
后台管理系统包含人员信息管理、权限管理。

### 项目演示

> 后台管理系统

前端项目`pmsystem-admin-web`地址：待更新...

## 前言

本系统对人事各种数据进行统一处理，避免数据存取、数据处理的重复，提
高工作效率，减少了系统数据处理的复杂性。本系统不仅人事管理人员从繁重的
工作中解脱出来，而且提高了人事管理的效率，提高了人事管理的科学性。 

### 组织结构

pmsystem
``` lua
├── pmsystem-mbg -- MyBatisGenerator生成的数据库操作代码
├── pmsystem-admin -- 后台管理系统接口
├── pmsystem-common -- 一些封装数据
└── pmsystem-demo -- 框架搭建时的测试代码
```
### 技术选型

#### 后端技术

技术 | 说明 | 官网
----|----|----
Spring Boot | 容器+MVC框架 | [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
Spring Security | 认证和授权框架 | [https://spring.io/projects/spring-security](https://spring.io/projects/spring-security)
MyBatis | ORM框架  | [http://www.mybatis.org/mybatis-3/zh/index.html](http://www.mybatis.org/mybatis-3/zh/index.html)
MyBatisGenerator | 数据层代码生成 | [http://www.mybatis.org/generator/index.html](http://www.mybatis.org/generator/index.html)
PageHelper | MyBatis物理分页插件 | [http://git.oschina.net/free/Mybatis_PageHelper](http://git.oschina.net/free/Mybatis_PageHelper)
Swagger-UI | 文档生产工具 | [https://github.com/swagger-api/swagger-ui](https://github.com/swagger-api/swagger-ui)
Hibernator-Validator | 验证框架 | [http://hibernate.org/validator/](http://hibernate.org/validator/)
Druid | 数据库连接池 | [https://github.com/alibaba/druid](https://github.com/alibaba/druid)
OSS | 对象存储 | [https://github.com/aliyun/aliyun-oss-java-sdk](https://github.com/aliyun/aliyun-oss-java-sdk)
JWT | JWT登录支持 | [https://github.com/jwtk/jjwt](https://github.com/jwtk/jjwt)
LogStash | 日志收集 | [https://github.com/logstash/logstash-logback-encoder](https://github.com/logstash/logstash-logback-encoder)
Lombok | 简化对象封装工具 | [https://github.com/rzwitserloot/lombok](https://github.com/rzwitserloot/lombok)

## 环境搭建

### 开发工具

工具 | 说明 | 官网
----|----|----
IDEA | 开发IDE | https://www.jetbrains.com/idea/download

### 开发环境

工具 | 版本号 | 下载
----|----|----
JDK | 1.8 | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Mysql | 5.7 | https://www.mysql.com/

### 搭建步骤

> 本地环境搭建

- 本地安装开发环境中的所有工具并启动(只启动mall-admin,仅需安装mysql)
- 克隆源代码到本地，使用IDEA或Eclipse打开，并完成编译;
- 在mysql中新建mall数据库，导入document/sql下的renshi.sql文件；
- 启动mall-admin项目：直接运行com.spaker.pmsystem.PmsystemPmadminApplication的main方法即可，
  接口文档地址：http://localhost:8080/swagger-ui.html;
  
  ## 参考资料
  
  - [Spring实战（第4版）](https://book.douban.com/subject/26767354/)
  - [MyBatis从入门到精通](https://book.douban.com/subject/27074809/)
  - [深入浅出MySQL](https://book.douban.com/subject/25817684/)