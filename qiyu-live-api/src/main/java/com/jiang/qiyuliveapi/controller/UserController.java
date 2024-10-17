package com.jiang.qiyuliveapi.controller;


import com.jiang.qiyu.common.dto.user.UserDTO;
import com.jiang.qiyuliveuserinterface.rpc.DemoService;
import com.jiang.qiyuliveuserinterface.rpc.IUserRpc;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    //调用远程dubbo服务
    @DubboReference
    private IUserRpc userRpc;

    // demo
    @DubboReference
    private DemoService demoService;

    @GetMapping("/name")
    public void test(){
        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);
    }

    @GetMapping("/getUserInfo")
    public UserDTO getUserInfo(Long userId) {
        return userRpc.getUserById(userId);
    }

    @GetMapping("/updateUserInfo")
    public boolean updateUserInfo(UserDTO userDTO) {
        return userRpc.updateUserInfo(userDTO);
    }

    @GetMapping("/insertUserInfo")
    public boolean insertUserInfo(UserDTO userDTO) {
        return userRpc.insertOne(userDTO);
    }

}
