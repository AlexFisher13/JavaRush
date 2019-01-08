package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        String params = URL.split("[?]")[1];
        String[] paramArr = params.split("[&]");

        Map<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < paramArr.length; i++) {
            try {
                map.put(paramArr[i].split("[=]")[0], paramArr[i].split("[=]")[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                map.put(paramArr[i].split("[=]")[0], null);
            }
        }

        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.print(m.getKey() + " ");
        }
        System.out.println();

        if (map.containsKey("obj")) {
            try {
                alert(Double.parseDouble(map.get("obj")));
            } catch (Exception e) {
                alert(map.get("obj"));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
