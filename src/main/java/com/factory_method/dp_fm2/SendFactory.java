package com.factory_method.dp_fm2;

/**
 * 常见工厂
 * Created by Saber on 2017/7/2.
 */
public class SendFactory {

    /**
     * 发邮件
     * @return MailSender
     */
    public Sender produceMail(){
        return new MailSender();
    }

    /**
     * 发短信
     * @return SmsSender
     */
    public Sender produceSms(){
        return new SmsSender();
    }
}
