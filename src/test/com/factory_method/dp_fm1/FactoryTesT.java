package com.factory_method.dp_fm1;

/**
 * Created by Saber on 2017/7/2.
 */
public class FactoryTesT {

    public static void main(String[] args) {

        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();

    }


}
