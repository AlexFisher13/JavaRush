package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        boolean tree = false;

        if (a == b) {
            if (a == c) {
                System.out.println(a + " " + a + " " + a);
                tree = true;
            } else
                System.out.println(a + " " + b);
        }
        if (a == c & tree == false) {
            if (b == c)
                System.out.println(a + " " + a + " " + a);
            else
                System.out.println(a + " " + c);
        }
        if (c == b & tree == false) {
            if (a == c)
                System.out.println(a + " " + a + " " + a);
            else
                System.out.println(c + " " + b);
        }
    }
}