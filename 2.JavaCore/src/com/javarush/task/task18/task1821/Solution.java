package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(args[0]);
        byte[] buffer = new byte[file.available()];
        file.read(buffer);
        file.close();

        Map<Byte, Integer> map = new TreeMap<>();
        for (byte b : buffer) {
            map.put(b, map.getOrDefault(b, 0) + 1);
        }

        for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
            System.out.println(((char) (byte) pair.getKey()) + " " + pair.getValue());
        }
    }
}
