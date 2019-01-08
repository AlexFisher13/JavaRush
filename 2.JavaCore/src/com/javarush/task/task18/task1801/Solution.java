package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ///Users/fisher/Desktop/1.rtf
        FileInputStream file = new FileInputStream(reader.readLine());

        int maxByte = file.read();
        int tmp;

        while (file.available() > 0) {
            tmp = file.read();
            if (tmp > maxByte)
                maxByte = tmp;
        }
        System.out.println(maxByte);
        file.close();
        reader.close();
    }
}
