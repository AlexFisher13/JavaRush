package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            str.add(reader.readLine());
        }
        int minStr = getMin(str);
        int maxStr = getMax(str);

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() == minStr) {
                System.out.println(str.get(i));
                break;
            }
            if (str.get(i).length() == maxStr) {
                System.out.println(str.get(i));
                break;
            }
        }
    }

        public static int getMin(ArrayList<String> str) {
            int min = str.get(0).length();
            for (int i = 0; i < str.size(); i++) {
                if (str.get(i).length() < min)
                    min = str.get(i).length();
            }
            return min;
        }

        public static int getMax(ArrayList<String> str) {
            int min = str.get(0).length();
            for (int i = 0; i < str.size(); i++) {
                if (str.get(i).length() > min)
                    min = str.get(i).length();
            }
            return min;
        }
}
