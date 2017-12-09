package com.p2p.sso.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * 创建者: 5145 创建时间: 2017/12/6.
 * 名字:mall
 */
public class MailUtil {
    /**
     * 发送邮件的方法
     *
     * @param to   :发送给谁
     * @param code :邮箱激活码
     */
    public void sendMail(String to, String code) {
        //1.创建连接对象, 连接到邮箱服务器
        Properties properties = new Properties();
//        properties.setProperty();
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("root@god.com", "root");
            }
        });
        // 2.创建邮件对象
        Message message = new MimeMessage(session);
        try {
            // 2.1设置发件人
            message.setFrom(new InternetAddress("root@god.com"));
            // 2.2设置收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // 2.3设置邮件主题
            message.setSubject("来自嘟噜猫的激活邮件");
            // 2.4设置的正文
            message.setContent("<h1>来自XXX网址的激活邮件, 请点击以下链接</h1><h3><a href='http://localhost:8080/user/regist?code=" + code + "'>" + code + "</a></h3>","text/html;charset=UTF-8");
            // 3.发送激活邮件
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
