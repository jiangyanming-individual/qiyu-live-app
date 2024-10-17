package com.jiang.qiyuliveuserprovider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiang.qiyu.common.dto.user.UserDTO;
import com.jiang.qiyu.common.entity.User;


/**
 * UserService
 */
public interface IUserService extends IService<User> {

    /**
     * 根据用户id进行查询
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