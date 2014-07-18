package com.xuzh.singleton;

public class SingletonInner {

    /**
     * 内部类实现单例模式
     * 延迟加载，减少内存开销
     * 
     * @author xuzhaohu
     * 
     */
    private static class SingletonHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    /**
     * 私有的构造函数
     */
    private SingletonInner() {

    }

    public static SingletonInner getInstance() {
        return SingletonHolder.instance;
    }

    protected void method() {
        System.out.println("SingletonInner");
    }
}
