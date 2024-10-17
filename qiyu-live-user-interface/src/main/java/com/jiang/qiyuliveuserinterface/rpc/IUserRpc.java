package com.jiang.qiyuliveuserinterface.rpc;

import com.jiang.qiyu.common.dto.user.UserDTO;

/**
 * 用户rpc远程调用的接口；进行增删改查的接口
 */
public interface IUserRpc {

    /**
     * 根据用户id进行查询
     *
     * @param userId
     * @return
     */
    UserDTO getUserById(Long userId);

    /**
     * 更新用户信息
     * @param userDTO
     * @return
     */
    boolean updateUserInfo(UserDTO userDTO);

    /**
     * 插入用户
     * @param userDTO
     * @return
     */
    boolean insertOne(UserDTO userDTO);

}
