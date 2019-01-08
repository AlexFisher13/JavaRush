package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> str = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            str.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> str3 = new ArrayList<Integer>();
        ArrayList<Integer> str2 = new ArrayList<Integer>();
        ArrayList<Integer> str0 = new ArrayList<Integer>();

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i) % 3 == 0)
                str3.add(str.get(i));
            if (str.get(i) % 2 == 0)
                str2.add(str.get(i));
            if (str.get(i) % 3 != 0 & str.get(i) % 2 != 0)
                str0.add(str.get(i));
        }

        printList(str3);
        printList(str2);
        printList(str0);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
