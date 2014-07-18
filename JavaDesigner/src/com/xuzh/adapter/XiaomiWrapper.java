package com.xuzh.adapter;

/**
 * 对象的适配器模式
 * 
 * @author xuzhaohu
 * 
 */
public class XiaomiWrapper implements Usb {

    /**
     * 1.创建一个Wrapper类，持有原类的一个实例，
     * 2.在Wrapper类的方法中，调用实例的方法就行
     */
    private Phone phone;

    public XiaomiWrapper(Phone phone) {

        this.phone = phone;
    }

    @Override
    public void store() {
        // TODO Auto-generated method stub
        System.out.println("store implements usb");

    }

    @Override
    public void takeAlong() {
        // TODO Auto-generated method stub
        phone.takeAlong();
    }

}
