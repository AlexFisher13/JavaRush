package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileWriter fileWriter = new FileWriter(filename);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String s = reader.readLine();

        while (!s.equals("exit")) {
            writer.write(s + "\n");
            s = reader.readLine();
        }
        writer.write("exit");
        reader.close();
        writer.close();
    }
}
