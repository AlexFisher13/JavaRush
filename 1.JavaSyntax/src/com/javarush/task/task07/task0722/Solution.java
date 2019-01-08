package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp;
        while (true) {
            tmp = reader.readLine();
            if (!tmp.equals("end"))
                list.add(tmp);
            else
                break;
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}