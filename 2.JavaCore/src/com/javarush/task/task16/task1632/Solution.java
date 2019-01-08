package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());
    }

    public static void main(String[] args) {
    }


    public static class FirstThread extends Thread {

        public FirstThread() {
            super();
        }

        public void run() {
            while (true){}
        }
    }
    public static class SecondThread extends Thread {

        public SecondThread() {
            super();
        }

        public void run() {
            try {
              Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class ThirdThread extends Thread {

        public ThirdThread() {
            super();
        }

        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class FourthThread extends Thread implements Message {

        public FourthThread() {
            super();
        }

        public void run() {
            while (!this.isInterrupted()) ;
        }

        public void showWarning() {
            this.interrupt();
        }
    }
    public static class FifthThread extends Thread {

        public FifthThread() {
            super();
        }

        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String s;
            try {
                while(true) {
                    s = reader.readLine();
                    if (!s.equals("N")) {
                        sum += Integer.parseInt(s);
                    } else break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(sum);
        }
    }
}