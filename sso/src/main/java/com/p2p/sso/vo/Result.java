package com.p2p.sso.vo;

/**
 * 创建者: 51459 创建时间: 2017/11/18.
 * 名字:girl
 */
public class Result<T> {
    /** 错误码 */
    private Integer code;
    /** 提示信息 */
    private String msg;
    /** 具体内容 */
    private T Data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        msg = msg;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
