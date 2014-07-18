package com.xuzh.factory;

public class PhoneFactory implements Provider {

    @Override
    public Usb produce() {
        // TODO Auto-generated method stub
        return new Phone();
    }

}
