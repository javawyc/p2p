package com.p2p.portal.util;

import java.util.Base64;

public class BaseUtil {
    //编码
    public static String encode(String src){
        return Base64.getEncoder().encodeToString(src.getBytes());

    }
    //解码
    public static String decode(String src){
        byte[] bytes = Base64.getDecoder().decode(src);
        return new String(bytes);
    }

    public static void main(String[] args) {
        String s = encode("@#@##@dddssfdgd?");
        System.out.println(s);
    }

}
