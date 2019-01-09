package com.javarush.task.task14.task1419;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.rmi.AccessException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        }
        catch (Exception e) { exceptions.add(e); }

        try {
            throw new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException e) { exceptions.add(e); }

        try {
            throw new NullPointerException();
        }
        catch (NullPointerException e) { exceptions.add(e); }
        try {
            throw new InstantiationException();
        }
        catch (InstantiationException e) { exceptions.add(e); }

        try {
            throw new BrokenBarrierException();
        }
        catch (BrokenBarrierException e) { exceptions.add(e); }


        //напишите тут ваш код

        try {
            throw new InterruptedException();
        }
        catch (InterruptedException e) { exceptions.add(e); }

        try {
            throw new IOException();
        }
        catch (IOException e) { exceptions.add(e); }

        try {
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e) { exceptions.add(e); }

        try {
            throw new SQLException();
        }
        catch (SQLException e) { exceptions.add(e); }

        try {
            throw new SQLDataException();
        }
        catch (SQLDataException e) { exceptions.add(e); }

    }
}
