package com.singleton;

import java.util.Vector;

/**
 * 影子实例
 * 为单例对象的属性同步更新
 * Created by Saber on 2017/7/2.
 */
public class ShadowSingletonTest {

    private static ShadowSingletonTest instance = null;

    private Vector properties = null;

    public Vector getProperties(){

        return properties;
    }

    private ShadowSingletonTest(){

    }

    private static synchronized void syncInit(){
        if( instance ==null ){
            instance = new ShadowSingletonTest();
        }
    }

    public static ShadowSingletonTest getInstance(){
        if ( instance == null ){
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        ShadowSingletonTest shadow = new ShadowSingletonTest();
        properties = shadow.getProperties();
    }
}
