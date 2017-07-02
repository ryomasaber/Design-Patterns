package com.factory_method.dp_fm3;

/**
 * Created by Saber on 2017/7/2.
 */
public class FactoryTest{

    public static void main(String[] args) {

        Sender sender = SendFactory.produceMail();
        sender.Send();

    }

}
