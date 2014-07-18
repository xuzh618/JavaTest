package com.xuzh.adapter;

/**
 * 接口的适配器模式
 * 1.借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法
 * 2.继承类可以选择性的实现接口中的方法
 * 
 * @author xuzhaohu
 * 
 */
public abstract class AbsPhone implements Usb {

    public void store() {
        System.out.println("AbsPhone implements usb's store methond");
    }

    public void takeAlong() {
        System.out.println("AbsPhone implements usb's takeAlong methond");
    }
}
