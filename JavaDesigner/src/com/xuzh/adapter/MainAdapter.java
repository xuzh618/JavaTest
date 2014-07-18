package com.xuzh.adapter;

/**
 * 适配者模式
 * 约定优于配置
 * 
 * @author xuzhaohu
 * 
 */
public class MainAdapter {

    public static void main(String[] args) {
        System.out.println("hello Adapter Pattern");

        System.out.println("************************");
        System.out.println("类适配者模式实例：");
        Xiaomi mi1 = new Xiaomi();
        mi1.takeAlong();
        mi1.store();

        System.out.println("************************");
        System.out.println("对象适配者模式实例：");
        XiaomiWrapper mi2 = new XiaomiWrapper(new Phone());
        mi2.takeAlong();
        mi2.store();

        System.out.println("************************");
        System.out.println("接口（通过抽象类）适配者模式实例：");
        Phone1 p1 = new Phone1();
        Phone2 p2 = new Phone2();
        p1.store();
        p1.takeAlong();
        p2.takeAlong();
        p2.store();

        /**
         * 1.android 源码中应用接口适配者模式 ListAdpater: BaseAdapter: ArrayAdapter, CursorAdapter
         * 
         * 2.查看项目中的用到的接口适配者模式：DialogCallBack
         * 
         */

    }
    /**
     * 1.android 源码中应用适配者模式的场景 BaseAdapter
     * 
     * 2.查看手机专家中的用到的适配者模式：Adapter
     */
}
