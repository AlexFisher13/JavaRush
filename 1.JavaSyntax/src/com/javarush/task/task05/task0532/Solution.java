package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int maximum = 0;
        int n = 0;

        if (k > 0) {
            maximum = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < k-1; i++) {
            n = Integer.parseInt(reader.readLine());
            if (n > maximum) {
                maximum = n;
            }
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }


}
