package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileReader file1 = new FileReader(fileName1);
        FileWriter file2 = new FileWriter(fileName2);
        int tmp = 0;

        for (int i = 1; file1.ready(); i++) {
            tmp = file1.read();
            if (i % 2 == 0) {
                file2.write(tmp);
            }
        }

        file1.close();
        file2.close();

    }
}
