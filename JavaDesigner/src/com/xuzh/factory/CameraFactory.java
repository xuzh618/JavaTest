package com.xuzh.factory;

public class CameraFactory implements Provider {

    @Override
    public Usb produce() {
        // TODO Auto-generated method stub
        return new Camera();
    }

}
