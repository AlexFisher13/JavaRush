package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int sum = 0;
        while(true) {
            if (i != -1) {
                sum += i;
                i = Integer.parseInt(reader.readLine());
            } else
                break;
        }
        System.out.println(sum-1);
    }
}
