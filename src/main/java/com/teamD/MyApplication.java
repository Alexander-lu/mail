package com.teamD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
/**
 *myApplication会自动扫描com.teadD包下的所有java文件
 * @author teamD
 * @version 1.0
 * 20220628
 **/
@SpringBootApplication
public class MyApplication {
    /**
     * 启动服务器
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MyApplication.class, args);
        DataSource bean = applicationContext.getBean(DataSource.class);
        System.out.println(bean);
    }
}
