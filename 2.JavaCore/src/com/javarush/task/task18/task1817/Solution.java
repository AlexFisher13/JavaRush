package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int fileSize = fileInputStream.available();
        byte[] bytes = new byte[fileSize];
        int spaces = 0;

        for (int i = 0; i < fileSize; i++) {
            bytes[i] = (byte) fileInputStream.read();
            if (bytes[i] == 32) {
                spaces++;
            }
        }

        float f = (float) spaces/fileSize*100;

        DecimalFormat df = new DecimalFormat("##.00");

//        f = Math.round(f);

//        df.format(f);

        System.out.println(df.format(f));
        fileInputStream.close();

    }
}
