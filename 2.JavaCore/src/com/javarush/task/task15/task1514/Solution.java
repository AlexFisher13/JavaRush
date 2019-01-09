package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.2d, "dfghhh");
        labels.put(1.3d, "dfgj");
        labels.put(1.4d, "dffhg");
        labels.put(1.5d, "dfdfg");
        labels.put(1.6d, "sdfg");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
