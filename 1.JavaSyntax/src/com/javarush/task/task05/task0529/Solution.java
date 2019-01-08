package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String i = reader.readLine();
        int sum = 0;

        while(true) {
            if (!i.equals("сумма")) {

                sum += Integer.parseInt(i);
                i = reader.readLine();
            } else break;
        }
        System.out.println(sum);
    }

}
