package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int m = 1;
        int n = 1;

        while (n < 11) {
            while(m < 11) {
                System.out.print(m*n + " ");
                m++;
            }
            System.out.println();
            m = 1;
            n++;
        }

    }
}
