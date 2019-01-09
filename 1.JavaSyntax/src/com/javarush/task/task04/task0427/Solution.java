package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());

        if (x < 10 & x >= 1) {
            if (x%2 == 0)
                System.out.println("четное однозначное число");
            else
                System.out.println("нечетное однозначное число");
        }
        if (x < 100 & x >= 10) {
            if (x%2 == 0)
                System.out.println("четное двузначное число");
            else
                System.out.println("нечетное двузначное число");
        }
        if (x >= 100 & x <= 999) {
            if (x%2 == 0)
                System.out.println("четное трехзначное число");
            else
                System.out.println("нечетное трехзначное число");
        }

    }
}
