package com.spaker.pmsystem;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static void main(String[] args)throws Exception{
        //mbg执行过程中的警告信息
        List<String> warnings=new ArrayList<String>();
        //重复代码时，覆盖原代码
        boolean overwrite=true;
        //读取MBG配置文件
        InputStream is=Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration configuration=cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        //创建MBG
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(configuration,callback,warnings);
        myBatisGenerator.generate(null);

        for (String warning:warnings){
            System.out.println(warning);
        }

    }
}
