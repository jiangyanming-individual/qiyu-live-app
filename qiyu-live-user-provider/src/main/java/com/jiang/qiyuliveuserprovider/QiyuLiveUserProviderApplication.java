package com.jiang.qiyuliveuserprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
@MapperScan("com.jiang.qiyuliveuserprovider.mapper") //扫描mapper包
public class QiyuLiveUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(QiyuLiveUserProviderApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);//Dubbo 不使用tomcat, 使用netty
        springApplication.run(args);
    }

}
