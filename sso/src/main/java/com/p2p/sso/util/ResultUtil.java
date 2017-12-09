package com.p2p.sso.util;


import com.p2p.sso.vo.Result;

/**
 * 创建者: 51459 创建时间: 2017/11/18.
 * 名字:girl
 */
public class ResultUtil {

    public static Result success(){
        return success(null);
    }

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
