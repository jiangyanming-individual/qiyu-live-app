package com.jiang.qiyuliveuserprovider.rpc;

import com.jiang.qiyu.common.dto.user.UserDTO;
import com.jiang.qiyuliveuserinterface.rpc.IUserRpc;
import com.jiang.qiyuliveuserprovider.service.IUserService;
import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 设置为dubbo 服务：
 */
@DubboService
public class UserRpcImpl implements IUserRpc {

    //引用本地的服务
    @Resource
    private IUserService userService;

    /**
     * 查询用户：
     * @param userId
     * @return
     */
    @Override
    public UserDTO getUserById(Long userId) {
       return userService.getUserById(userId);
    }

    /**
     * 更新用户
     * @param userDTO
     * @return
     */
    @Override
    public boolean updateUserInfo(UserDTO userDTO) {
        return userService.updateUserInfo(userDTO);
    }

    /**
     * 插入用户
     * @param userDTO
     * @return
     */
    @Override
    public boolean insertOne(UserDTO userDTO) {
        return userService.insertOne(userDTO);
    }
}
