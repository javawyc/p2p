package com.p2p.sso.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 安全工具类
 * 创建者: 5145 创建时间: 2017/11/22.
 * 名字:mall
 */
public class SecurityUtil {

    //MD5加密
    public static String encrypt(String src) {
        try {
            //创建消息摘要实例对象
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            //摘要
            byte[] bytes = md5.digest(src.getBytes());
//            String定长字符串   /StringBuffer实现了线程安全(同步加锁) /StringBuilder速度快
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<bytes.length;i++){
                int x=(int)bytes[i]&0xff;
                //加盐
                x=x+1;
                if (x<16){
                    sb.append(0);
                }
                sb.append(Integer.toHexString(x));
            }
            System.out.println(sb);
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        encrypt("abc");
    }
}
