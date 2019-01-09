package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = a%5;

        if (b < 3)
            System.out.println("зелёный");
        if (b >= 3 & b < 4)
            System.out.println("жёлтый");
        if (b >= 4 & b < 5)
            System.out.println("красный");
    }
}