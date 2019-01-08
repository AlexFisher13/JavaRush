package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        char[] s1 = s.toCharArray();
        s1[0] = Character.toUpperCase(s1[0]);
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == ' ') {
                s1[i+1] = Character.toUpperCase(s1[i+1]);
            }
        }
        String s2 = String.copyValueOf(s1);
        System.out.println(s2);

    }
}
