package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inStream1 = new FileInputStream(fileName1);
        FileInputStream inStream2 = new FileInputStream(fileName2);
        FileOutputStream outStream = new FileOutputStream(fileName1);


//        byte[] buffer = new byte[inStream1.available() + inStream2.available()];

        List<Byte> buffer = new LinkedList<Byte>();

        while (inStream2.available() > 0) {
            buffer.add((byte)inStream2.read());
        }

        while (inStream1.available() > 0) {
            buffer.add((byte)inStream1.read());
        }


        reader.close();
        inStream1.close();
        inStream2.close();


        for (byte b : buffer) {
            outStream.write(b);
        }


        outStream.close();
    }
}
///Users/fisher/Desktop/1.txt
///Users/fisher/Desktop/2.txt
