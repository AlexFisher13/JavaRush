package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] line = fileScanner.nextLine().split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(line[5]),
                    Integer.parseInt(line[4]) - 1, Integer.parseInt(line[3]));

            return new Person(line[1], line[2], line[0], calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("file name"));

        PersonScanner adapter = new PersonScannerAdapter(s);
        while (s.hasNext()) {
            System.out.println(adapter.read());
        }
        adapter.close();
    }
}