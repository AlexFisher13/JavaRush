package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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
        String text = buffer1.readLine();
        String[] res = text.split("[\\p{IsPunctuation}\\p{IsWhite_Space}]+");
        List<Integer> list = new ArrayList<>();
        for (String s : res) {
            try {
                list.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                continue;
            }
        }

        BufferedWriter w = new BufferedWriter(new FileWriter(fileName2));
        for (int i : list) {
            System.out.print(i + " ");
            w.write(i + " ");
        }
        buffer1.close();
        w.close();
    }
}
