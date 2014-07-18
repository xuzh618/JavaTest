package com.xuzh.test;

import java.util.Arrays;

public class DemoByteBinary {

    public static void main(String[] args) {
        byte b = 'a';
        System.out.println("byte: " + b);
        byte arr[] = { 65, 66, 67, 68 };
        System.out.println("byte[] to string: " + arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.println("byte[i]: " + arr[i]);
            //二进制流
            System.out.println("byte[] to binary: " + Integer.toBinaryString(arr[i]));
            //十六制流
            System.out.println("byte[] to binary: " + Integer.toHexString(arr[i]));
        }
        String str = "1.0";
        double i = Double.parseDouble(str);
        int j = (int) i;
        System.out.println("i=" + i);
        System.out.println("j=" + j);

        boolean is = test(201, 3);
        boolean is1 = test(201, 2050);
        boolean is2 = test(100, 2050);
        boolean is3 = test(100, 3);
        System.out.println("is = " + is);
        System.out.println("is1 = " + is1);
        System.out.println("is2 = " + is2);
        System.out.println("is3 = " + is3);

    }

    public static boolean test(int phoneFreeSize, int sdCardFreeSize) {

        return (phoneFreeSize < 200 || sdCardFreeSize > 0 && sdCardFreeSize < 1024 * 2);

    }
}
