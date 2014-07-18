package com.xuzh.factory;

/**
 * 工厂方法
 * 
 * @author xuzhaohu
 * 
 */
public class MainFactory {

    public static void main(String[] args) {
        System.out.println("hello Factory pattern");
        System.out.println("************************");
        System.out.println("普通工厂方法实例：");

        /*普通工厂方法**/
        UsbFactory1 factory1 = new UsbFactory1();
        Usb usb1 = factory1.produce("camera");//+phone
        usb1.store();

        System.out.println("************************");
        System.out.println("多个工厂方法实例：");

        /*多个工厂方法模式**/
        UsbFactory2 factory2 = new UsbFactory2();
        Usb usb2 = factory2.producePhone();//+camera
        usb2.store();

        System.out.println("************************");
        System.out.println("静态工厂方法实例：");

        /*静态工厂方法模式**/
        Usb usb3 = UsbFactory3.producePhone();//+camera
        usb3.store();

        System.out.println("************************");
        System.out.println("抽象工厂方法实例：");

        /*抽象工厂方法模式**/
        /*1.扩展性好，不用修改源代码
         *2.添加一个实现USB接口的类+一个对应的实现Provider的工厂类**/
        Provider provider = new CameraFactory();
        Usb usb4 = provider.produce();
        usb4.store();

        /**
         * 1.android 源码中应用工厂方法的场景 ThreadFactory: AsyncTask/Connection: HttpsConnection
         * 
         * 2.查看手机专家中的用到的工厂方法模式：IObjectFactory: ObjectFactory
         * 
         * 3.Abstract Factory
         */

    }
}
