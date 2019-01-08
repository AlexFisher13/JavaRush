package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        String min;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        min = reader.readLine();
//        strings.add(min);

        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());


        min = strings.get(0);

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < min.length())
                min = strings.get(i);
        }

//        for (int i = 0; i < 4; i++) {
//            strings.add(reader.readLine());
//            if (strings.get(i).length() < min.length()) {
//                min = strings.get(i);
//            }
//        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == min.length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
