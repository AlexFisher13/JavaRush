package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));

        ArrayList<Integer> arr = new ArrayList<>();
        int i;
        while (scanner.hasNext()) {
            i = Integer.parseInt(scanner.next());
//            System.out.println(i);
            if (i % 2 == 0) {
                arr.add(i);
            }
        }


        Collections.sort(arr);

        for (int n : arr) {
            System.out.println(n);
        }

        reader.close();
        scanner.close();

    }
}
