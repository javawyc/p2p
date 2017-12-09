package com.p2p.sso.util;

import java.util.UUID;

/**
 * 创建者: 5145 创建时间: 2017/11/28.
 * 名字:mall
 */
public class UUIDUtil {
    public static String createID(){
        String s = UUID.randomUUID().toString();
        String s1 = s.replaceAll("-", "");
        return  s1;
    }

    public static void main(String[] args) {
        createID();
    }
}
