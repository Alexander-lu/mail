package com.teamD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class myApplication {
    /**
     * 启动服务器
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(myApplication.class, args);
        DataSource bean = applicationContext.getBean(DataSource.class);
        System.out.println(bean);
    }
}
