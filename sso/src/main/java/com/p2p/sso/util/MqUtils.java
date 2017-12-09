package com.p2p.sso.util;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 创建者: 5145 创建时间: 2017/12/9.
 * 名字:p2p_a
 */
@Component
public class MqUtils {
    @Resource
    private JmsTemplate jmsTemplate;

    public void sendOrderMessage(String msgName, String json) {
        //发送消息
        jmsTemplate.convertAndSend(msgName,json);
    }

    /*@JmsListener(destination = "first")
    public void listen(String json){
        System.out.println("收到json" + json);
    }*/
}
