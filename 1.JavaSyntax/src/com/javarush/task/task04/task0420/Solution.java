package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int tmp;
        if (a <= b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        if (b <= c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        if (a <= b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a + " " + b + " " + c);


    }
}
