package com.factory_method.dp_fm1;

/**
 * 常见工厂
 * Created by Saber on 2017/7/2.
 */
public class SendFactory {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
