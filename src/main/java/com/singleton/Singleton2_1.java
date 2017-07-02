package com.singleton;

/**
 * 加锁懒汉模式（线程安全)）
 * Created by Saber on 2017/7/2.
 */
public class Singleton2_1 {

    private static Singleton2_1 instance = null;
    private Singleton2_1(){}

    public static synchronized Singleton2_1 newInstance(){
        if( null == instance){
            instance = new Singleton2_1();
        }
        return instance;
    }

    /**、
    *
    * 加锁的懒汉模式看起来即解决了线程并发问题，又实现了延迟加载，然而它存在着性能问题，依然不够完美。
    * synchronized修饰的同步方法比一般方法要慢很多，如果多次调用getInstance()，累积的性能损耗就比较大了。
    * 因此就有了双重校验锁，先看下它的实现代码。
    * @see Singleton3 双重校验锁
    *
    * */
}
