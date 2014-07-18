package com.xuzh.test;

public class DemoSingletonInner {

    /**
     * 内部类实现单例模式
     * 
     * @author xuzhaohu
     * 
     */
    private static class SingletonHolder {
        private static DemoSingletonInner instance = new DemoSingletonInner();
    }

    /**
     * 私有的构造函数
     */
    private DemoSingletonInner() {

    }

    public static DemoSingletonInner getInstance() {
        return SingletonHolder.instance;
    }

    public void method() {

    }
}
