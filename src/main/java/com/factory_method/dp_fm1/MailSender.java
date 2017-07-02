package com.factory_method.dp_fm1;

/**
 * 发送邮件
 * Created by Saber on 2017/7/2.
 */
public class MailSender implements Sender{

    @Override
    public void Send() {
        System.out.println("this is mailsender!");

    }
}
