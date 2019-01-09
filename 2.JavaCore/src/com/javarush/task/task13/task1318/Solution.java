package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inStrem = new FileInputStream(reader.readLine());

        while (inStrem.available() > 0) {
            System.out.print((char)inStrem.read());
        }

        inStrem.close();
        reader.close();
    }
}