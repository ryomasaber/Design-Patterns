package com.abstract_factory;

/**
 * Created by Saber on 2017/7/2.
 */
public class SendMailFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
