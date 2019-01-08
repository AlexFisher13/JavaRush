package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 15; i++) {
            if (i%2 == 0) {
                evenSum += Integer.parseInt(reader.readLine());
            } else {
                oddSum += Integer.parseInt(reader.readLine());
            }
        }

        if (evenSum > oddSum)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
