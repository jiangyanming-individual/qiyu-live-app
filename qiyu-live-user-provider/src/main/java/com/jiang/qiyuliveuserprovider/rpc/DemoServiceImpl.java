package com.jiang.qiyuliveuserprovider.rpc;

import com.jiang.qiyuliveuserinterface.rpc.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

// dubbo 服务：
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}