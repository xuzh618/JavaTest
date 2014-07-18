package com.xuzh.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class DemoHashMap {

    public static void main(String[] args) {

        System.out.println("hello hash map");

        int s = -1;
        for (int i = 0; i < 32; i++) {
            s = indexFor(i, 32);
            System.out.println("index " + i + ": " + s);
        }

        //createHashMap();
    }

    static void createHashMap() {
        //HashMap
        Random r = new Random();

        HashMap<Integer, Integer> hashMap = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, r.nextInt(10));
        }

        System.out.println("key - value entrySet().iterator");
        Iterator<Entry<Integer, Integer>> iter = hashMap.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("key:" + key + "; val:" + val);
        }

        System.out.println("key keySet().iterator");
        Iterator<Integer> iter2 = hashMap.keySet().iterator();
        while (iter2.hasNext()) {
            Integer key = (Integer) iter2.next();
            Integer val = (Integer) hashMap.get(key);
            System.out.println("key:" + key + "; val:" + val);
        }

        System.out.println("value keySet().iterator");
        Iterator<Integer> iter3 = hashMap.values().iterator();
        while (iter3.hasNext()) {
            Integer val = (Integer) iter3.next();
            System.out.println("val:" + val);

        }
        System.out.println("hash size:" + hashMap.size());
    }

    static int indexFor(int h, int length) {
        // assert Integer.bitCount(length) == 1 : "length must be a non-zero power of 2";
        return h & (length - 1);
    }

}
