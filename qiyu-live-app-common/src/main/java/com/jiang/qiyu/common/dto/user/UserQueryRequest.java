package com.jiang.qiyu.common.dto.user;


import com.jiang.qiyu.common.common.PageRequest;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户查询请求
 *
 */
@Data
public class UserQueryRequest extends PageRequest implements Serializable {

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