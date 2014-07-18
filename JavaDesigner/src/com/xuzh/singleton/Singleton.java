package com.xuzh.singleton;

/**
 * @function:单例模式
 * @author xuzhaohu
 * 
 */
public class Singleton {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;//(0) 饿汉式 在这里直接创建（无延时加载）,但线程安全

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    //        /* 1:懒汉式，静态工程方法，创建实例 */
    //        public static Singleton getInstance() {
    //            if (instance == null) {
    //                instance = new Singleton();
    //            }
    //            return instance;
    //        }

    /*缺点：线程不安全，序列化不方便*/

    /*2.懒汉式变种，解决线程安全问题**/
    //   
    //    public static synchronized Singleton getInstance() {
    //        if (instance == null) {
    //            instance = new Singleton();
    //        }
    //        return instance;
    //    }
    //
    //    /*加上synchronized，但是每次调用实例时都会加载**/
    //    public static Singleton getInstance() {
    //        synchronized (Singleton.class) {
    //            if (instance == null) {
    //                instance = new Singleton();
    //            }
    //        }
    //        return instance;
    //    }

    /*3.双重锁定:只在第一次初始化的时候加上同步锁*/
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /*缺点：jdk1.5之后对象可能处于乱序（out of order）执行的状态*/
    /*别的方法*/

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }

    protected void method() {
        //TODO
        System.out.println("Singleton");
    }
}