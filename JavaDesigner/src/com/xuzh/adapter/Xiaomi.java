package com.xuzh.adapter;

/**
 * 类的适配器模式
 * phone + Usb
 * 将Phone的功能扩展到Usb里
 * @author xuzhaohu
 * 
 */
public class Xiaomi extends Phone implements Usb {

    @Override
    public void store() {
        // TODO Auto-generated method stub
        System.out.println("store implements usb");
    }

}
