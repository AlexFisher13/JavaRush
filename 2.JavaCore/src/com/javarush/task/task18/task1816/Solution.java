package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileStream = new FileInputStream(args[0]);
        byte byteFromFile = 0;
        int count = 0;

        while (fileStream.available() > 0) {
            byteFromFile = (byte) fileStream.read();

            if (byteFromFile > 64 & byteFromFile < 123){
                count++;
            }
        }
        fileStream.close();
        System.out.println(count);




    }
}
