package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        String m = reader.readLine();

        if (n.equals(m))
            System.out.println("Имена идентичны");
        else {
            if (n.length() == m.length())
                System.out.println("Длины имен равны");
        }
    }
}
