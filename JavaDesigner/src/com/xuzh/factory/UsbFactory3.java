package com.xuzh.factory;

/**
 * 静态工厂方法
 * ：不需要实例
 * 
 * @author xuzhaohu
 * 
 */
public class UsbFactory3 {

    public static Phone producePhone() {
        return new Phone();
    }

    public static Camera produceCamera() {
        return new Camera();
    }
}
