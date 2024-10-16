package com.jiang.qiyuliveuserprovider.service;

import com.jiang.qiyuliveuserinterface.IUserRpc.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

// dubbo 服务：
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}