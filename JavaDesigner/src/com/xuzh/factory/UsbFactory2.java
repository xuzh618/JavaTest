package com.xuzh.factory;

/**
 * 多个工厂类方法
 * 
 * @author xuzhaohu
 * 
 */
public class UsbFactory2 {

    public Usb producePhone() {
        return new Phone();
    }

    public Usb produceCamera() {
        return new Camera();
    }

}
