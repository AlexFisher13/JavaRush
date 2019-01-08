package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ///Users/fisher/Desktop/1.rtf
        FileInputStream file = new FileInputStream(reader.readLine());

        ArrayList<Integer> bytes = new ArrayList<>();

        int minCount = 100000;

        while (file.available() > 0) {
            bytes.add(file.read());
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Integer i : bytes) {
            map.put(i, Collections.frequency(bytes, i));
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
            if (pair.getValue() < minCount) {
                minCount = pair.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == minCount) {
                System.out.print(pair.getKey() + " ");
            }
        }

        file.close();
        reader.close();

    }
}
