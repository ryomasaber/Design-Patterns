package com.singleton;

/**
 * 3.指令集优化的双重检验锁
 * Created by Saber on 2017/7/3.
 */
public class Singleton3_1 {

    private static volatile Singleton3_1 instance = null;
    private Singleton3_1(){}

    public static Singleton3_1 getInstance(){
        if( instance == null ){
            synchronized (Singleton3_1.class){
                if( instance ==null ){
                    return new Singleton3_1();
                }
            }
        }
        return instance;
    }

}
