package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in;


        while (true) {
           in = new FileInputStream(reader.readLine());
           if (in.available() < 1000) {
               in.close();
               throw new DownloadException();
           }
        }
    }

    public static class DownloadException extends Exception {

    }
}
