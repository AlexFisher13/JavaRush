package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileOutputStream out = new FileOutputStream(new File(reader.readLine()));

        LinkedList<Byte> bytes =  new LinkedList<>();


        while(in.available() > 0){
            bytes.add((byte) in.read());
        }

        for (int i = bytes.size() - 1; i > -1; i--) {
            out.write(bytes.get(i));
        }

        reader.close();
        in.close();
        out.close();
    }
}
