package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[20];
        int[] b = new int[10];
        int[] c = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < 10; i++) {
            c[i] = a[10+i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
