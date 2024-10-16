package com.jiang.qiyuliveapi.controller;


import com.jiang.qiyuliveuserinterface.IUserRpc.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    //调用远程dubbo服务
    @DubboReference
    private DemoService demoService;


    @GetMapping("/name")
    public void test(){
        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);
    }

}
