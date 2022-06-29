package com.teamD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
/**
 * SpringBootApplication注解表示开启组件扫描和自动配置
 *组件扫描会自动扫描com.teadD包下的所有java文件
 * 自动配置会自动配置所有Configuration类
 * SpringBootApplication注解里包含了Configuration，ComponentScan和EnableAutoConfuguration这3个注解
 * Configuration表明该类属于配置类
 * ComponentScan表明扫描类
 * EnableAutoConfuguration开启了自动配置
 * @author teamD
 * @version 1.0
 * 20220628
 **/
@SpringBootApplication
public class MyApplication {
    /**
     * main方法用于启动应用程序
     */
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
