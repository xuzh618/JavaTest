package com.xuzh.factory;

/**
 * 普通工厂方法
 * 参数传递的字符串会出错
 * ：正确创建对象
 * 
 * @author xuzhaohu
 * 
 */
public class UsbFactory1 {

    public Usb produce(String type) {
        if ("phone".equals(type)) {
            return new Phone();
        } else if ("camera".equals(type)) {
            return new Camera();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
