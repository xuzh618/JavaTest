package com.xuzh.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoReadTxt {

    //private final static String sourcePath = "E://11.txt";
    private final static String[] sourcePaths = { "E://hantong.txt", "E://wangluyuan.txt", "E://yinliwen.txt",
            "E://xieyueming.txt", "E://liuhaifeng.txt" };
    private final static String[] destPaths = { "hantong_code.txt", "wangluyuan_code.txt", "yinliwen_code.txt",
            "xieyueming_code.txt", "liuhaifeng_code.txt" };;

    public static void main(String[] args) {

        try {
            //readFromTxt(sourcePath);
            for (int i = 0; i < 5; i++) {
                System.out.println("start");
                readFromExcel(sourcePaths[i], destPaths[i]);
                System.out.println("end");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromTxt(String filePath) throws IOException {
        //File file = new File("D://modeltxt//1.txt");
        File file = new File(filePath);
        FileInputStream is = new FileInputStream(file);
        // 设置 读取文件的编码类型。。。
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String s1 = null;
        String arr[] = new String[50];
        while ((s1 = br.readLine()) != null) {
            String content = s1;
            System.out.println(content);
            String newContent = "";
            String model = "";
            arr = strSplit(content, " ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            if (arr != null) {
                for (int i = 0; i < 3; i++) {
                    newContent += arr[i] + " ";
                }

                for (int i = 3; i < arr.length - 2; i++) {
                    if (i == arr.length - 3)
                        model += arr[i];
                    else
                        model += arr[i] + "-";
                }
                newContent += model + " ";

                for (int i = arr.length - 2; i < arr.length; i++) {
                    newContent += arr[i] + " ";
                }
            }
            System.out.println(newContent);
            writeToTxt(destPaths[0], newContent);
        }
        br.close();
        isr.close();
    }

    public static final String DEAFULT_STR1 = "360斥资1亿免费修手机，服务码:";
    public static final String DEAFULT_STR2 = "。有效期至2014.05.24。[可爱]具体活动内容请详见http://bang.360.cn/519";

    public static void readFromExcel(String filePath, String destPath) throws IOException {

        File file = new File(filePath);
        FileInputStream is = new FileInputStream(file);
        // 设置 读取文件的编码类型。。。
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String s1 = null;
        while ((s1 = br.readLine()) != null) {
            String newContent = DEAFULT_STR1 + s1 + DEAFULT_STR2;
            System.out.println(newContent);
            writeToTxt(destPath, newContent);
        }
        br.close();
        isr.close();
    }

    public static void writeToTxt(String fileName, String content) {
        try {
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件   
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("\r\n" + content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String[] strSplit(String str, String split) {
        String[] newStr = null;
        String[] newStr1 = null;
        if (!" ".equals(str) && str != null) {
            newStr = str.split(split);
        }

        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i] != null && !"".equals(newStr[i])) {
                newStr1 = newStr;
            }
        }

        return newStr1;
    }
}
