package com.factory_method.dp_fm3;

/**
 * 发送短信
 * Created by Saber on 2017/7/2.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender");
    }
}
