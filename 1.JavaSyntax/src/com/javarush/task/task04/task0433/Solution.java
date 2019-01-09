package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 10;
        int m = 10;
        while (n > 0) {
            while(m > 0) {
                System.out.print("S");
                m--;
            }
            m = 10;
            System.out.println();
            n--;
        }

    }
}
