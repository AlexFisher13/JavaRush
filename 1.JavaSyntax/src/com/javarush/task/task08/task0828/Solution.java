package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "January");
        map.put(1, "February");
        map.put(2, "March");
        map.put(3, "April");
        map.put(4, "May");
        map.put(5, "June");
        map.put(6, "July");
        map.put(7, "August");
        map.put(8, "September");
        map.put(9, "October");
        map.put(10, "November");
        map.put(11, "December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String i = reader.readLine();

        for (Map.Entry<Integer, String> s: map.entrySet()) {
            if (s.getValue().toLowerCase().equals(i.toLowerCase()))
                System.out.println(i + " is the " + (s.getKey()+1) +" month");
        }

    }
}
