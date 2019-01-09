package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader file = new FileReader(fileName);
        reader.close();
        file.close();

        List<String> products = Files.readAllLines(Paths.get(fileName) , StandardCharsets.UTF_8);
        String[] product;
        String id = args[0];

        for (String s : products) {
            product = s.split(" ");
            if (product[0].equals(id)) {
                System.out.println(s);
            }
        }
    }
}
