package com.xuzh.singleton;

public class MainSingleton {
    public static void main(String[] args) {

        System.out.println("hello Singleton Pattern");

        System.out.println("*********************");
        System.out.println("常见的单例模式");
        Singleton.getInstance().method();

        System.out.println("*********************");
        System.out.println("内部内单例模式");
        SingletonInner.getInstance().method();

        System.out.println("*********************");
        System.out.println("枚举型单例模式");
        SingletonEnum.instance.method();

        /**
         * 1.android 源码中应用单例的场景 InputMethodManager/AccessibilityManager
         * 2.开源sdk中用单例的场景 ImageLoader
         * 3.查看手机专家中的用到的单例模式：APPClient/PushDbHelper
         * 4.JDK源码中 Runtime 就是饿汉式的单例模式
         */

    }
}
