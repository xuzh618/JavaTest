package com.xuzh.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class DemoDate {

    private static SimpleDateFormat logfile = new SimpleDateFormat("MM-dd-hh");// 日志文件格式

    public static void main(String[] args) {

        Date nowtime = new Date();
        String needWriteFiel = logfile.format(nowtime);

        System.out.println("fileName1: " + needWriteFiel);

        System.out.println("fileName2: " + getDate());

    }

    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-hh");
        String newDtae = sdf.format(date);
        return newDtae;
    }

}
