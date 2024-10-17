package com.jiang.qiyuliveapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDubbo // 开启dubbo
@EnableDiscoveryClient //注册中心
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class}) // 排除数据库
public class QiyuLiveApiApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(QiyuLiveApiApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
        springApplication.run(args);
    }

}
