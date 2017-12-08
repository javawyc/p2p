package com.p2p.restful.po;

import java.io.Serializable;
import java.util.Date;

public class T_USER implements Serializable {
    private int id;
    private String email;
    private String emailStatus;//邮箱验证
    private String identity;//用户id   uuid
    private String ip;// 登陆ip
    private Date loginTime;
    private String onLock;
    private String password;
    private String payPassword;
    private String payPwdStatus;//登陆密码验证
    private String phone;
    private String phoneStatus;//  手机验证
    private String randomCode;//随机激活码
    private String realName;//真实姓名
    private String realNameStatus;//实名验证
    private Date registerTime;
    private String remark;//备注
    private int sumFriends;//好友数量统计
    private int userSecure;//安全等级
    private int userType;//用户类型0投资人1借款人
    private String userName;


}
