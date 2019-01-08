package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        byte comma = 44;
        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file = new FileInputStream(reader.readLine());

        while (file.available() > 0) {
            if (file.read() == comma) {
                count++;
            }
        }

        System.out.println(count);

        reader.close();
        file.close();
    }
}
