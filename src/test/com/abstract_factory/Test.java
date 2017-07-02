package com.abstract_factory;

/**
 * Created by Saber on 2017/7/2.
 */
public class Test{

    public static void main(String[] args) {

        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
