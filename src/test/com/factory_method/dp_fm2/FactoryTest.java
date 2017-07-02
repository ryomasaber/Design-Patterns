package com.factory_method.dp_fm2;

/**
 * Created by Saber on 2017/7/2.
 */
public class FactoryTest {

    public static void main(String[] args) {

        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }

}
