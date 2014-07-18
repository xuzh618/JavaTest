package com.xuzh.test;

public class DemoString {

    private static final int COUNT = 100000;

    /**
     * @param args
     */
    public static void main(String[] args) {

        //++
        long start_00 = System.currentTimeMillis();
        String a0 = "a";
        a0 = "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b"
                + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b"
                + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b"
                + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b"
                + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b" + "b";
        long end_00 = System.currentTimeMillis();
        System.out.println("  0   所消耗的时间：" + (end_00 - start_00) + "毫米");
        //+
        long start_01 = System.currentTimeMillis();
        String a = "a";
        for (int i = 0; i < COUNT; i++) {
            a += "b";
        }
        long end_01 = System.currentTimeMillis();
        System.out.println("  +   所消耗的时间：" + (end_01 - start_01) + "毫米");

        //concat()
        long start_02 = System.currentTimeMillis();
        String c = "c";
        for (int i = 0; i < COUNT; i++) {
            c = c.concat("d");
        }
        long end_02 = System.currentTimeMillis();
        System.out.println("concat所消耗的时间：" + (end_02 - start_02) + "毫米");

        //append
        long start_03 = System.currentTimeMillis();
        StringBuffer e = new StringBuffer("e");
        for (int i = 0; i < COUNT; i++) {
            e.append("d");
        }
        long end_03 = System.currentTimeMillis();
        System.out.println("append所消耗的时间：" + (end_03 - start_03) + "毫米");
    }

}
