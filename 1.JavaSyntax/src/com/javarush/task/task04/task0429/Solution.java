package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countP = 0;
        int countM = 0;

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a != 0) {
                if (a > 0 )
                    countP++;
                else
                    countM++;
            }
        }

        System.out.println("количество отрицательных чисел: " + countM);
        System.out.println("количество положительных чисел: " + countP);

    }
}
