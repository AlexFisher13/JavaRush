package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double i = Double.parseDouble(reader.readLine());
        double sum = 0;
        int count = 0;

        while(true) {
            if (i != -1) {
                sum += i;
                count++;
                i = Double.parseDouble(reader.readLine());
            } else break;
        }
        System.out.println(sum/count);
    }
}

