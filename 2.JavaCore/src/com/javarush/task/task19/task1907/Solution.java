package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader file = new FileReader(fileName);
        String text="";
        while (file.ready()) {
            text += String.valueOf((char)file.read());
        }
        file.close();

        String[] res = text.split("[\\p{IsPunctuation}\\p{IsWhite_Space}]+");

        int count = 0;
        for (String l : res) {
            if (l.equals("world")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
