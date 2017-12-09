package com.p2p.sso.po;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getOnLock() {
        return onLock;
    }

    public void setOnLock(String onLock) {
        this.onLock = onLock;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getPayPwdStatus() {
        return payPwdStatus;
    }

    public void setPayPwdStatus(String payPwdStatus) {
        this.payPwdStatus = payPwdStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealNameStatus() {
        return realNameStatus;
    }

    public void setRealNameStatus(String realNameStatus) {
        this.realNameStatus = realNameStatus;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSumFriends() {
        return sumFriends;
    }

    public void setSumFriends(int sumFriends) {
        this.sumFriends = sumFriends;
    }

    public int getUserSecure() {
        return userSecure;
    }

    public void setUserSecure(int userSecure) {
        this.userSecure = userSecure;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
