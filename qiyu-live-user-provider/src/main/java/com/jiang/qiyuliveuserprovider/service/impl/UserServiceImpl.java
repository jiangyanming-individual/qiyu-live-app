package com.jiang.qiyuliveuserprovider.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiang.qiyu.common.dto.user.UserDTO;
import com.jiang.qiyu.common.entity.User;
import com.jiang.qiyuliveuserprovider.mapper.IUserMapper;
import com.jiang.qiyuliveuserprovider.service.IUserService;
import groovy.util.logging.Slf4j;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<IUserMapper, User>  implements IUserService {

    @Resource
    IUserMapper userMapper;

    @Override
    public UserDTO getUserById(Long userId) {
        if (userId == null || userId<=0){
            return null;
        }
        User user = userMapper.selectById(userId);
        return BeanUtil.copyProperties(user, UserDTO.class);
    }

    @Override
    public boolean updateUserInfo(UserDTO userDTO) {

        if (userDTO == null || userDTO.getUserId()==null){
            return false;
        }
        User user = BeanUtil.copyProperties(userDTO, User.class);
        int res= userMapper.updateById(user);
        if (res>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean insertOne(UserDTO userDTO) {
        User user = BeanUtil.copyProperties(userDTO, User.class);
        // 查询是否插入成功：
        int insert = userMapper.insert(user);
        if (insert>0){
            return true;
        }
        return false;
    }
}
