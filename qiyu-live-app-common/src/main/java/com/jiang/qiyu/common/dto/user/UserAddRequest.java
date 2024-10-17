package com.jiang.qiyu.common.dto.user;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户创建请求
 */
@Data
public class UserAddRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 4079363033445460398L;
    private Long userId;
    private String nickName;
    private String trueName;
    private String avatar;
    private Integer sex;
    private Integer workCity;
    private Integer bornCity;
    private Date bornDate;
    private Date createTime;
    private Date updateTime;
}