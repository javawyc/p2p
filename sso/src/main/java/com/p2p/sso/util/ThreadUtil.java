package com.p2p.sso.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建者: 5145 创建时间: 2017/11/28.
 * 名字:mall
 */
public class ThreadUtil {
    public static ExecutorService pool;
    static {
         pool = Executors.newFixedThreadPool(5);
    }

}
