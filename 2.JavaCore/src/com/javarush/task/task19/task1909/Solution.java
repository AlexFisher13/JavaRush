package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader buffer1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter buffer2 = new BufferedWriter(new FileWriter(fileName2));

        String text = buffer1.readLine();
        String[] res = text.split("");

        for (String s : res) {
            if (s.equals(".")) {
                buffer2.write("!");
            } else {
                buffer2.write(s);
            }
        }
        buffer1.close();
        buffer2.close();
    }
}