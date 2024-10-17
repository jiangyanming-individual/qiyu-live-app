package com.jiang.qiyuliveuserprovider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiang.qiyu.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * mybatis的mapper：
 */
@Mapper
public interface IUserMapper extends BaseMapper<User> {
}