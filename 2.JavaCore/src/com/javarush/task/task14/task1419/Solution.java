package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
    public static class Cat {
        int age;
        int getAge () {
            return this.age;
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            InputStream is = new FileInputStream(new File(""));
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[0];
            int a = array[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("qwe");

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            Object obj = null;
            obj.hashCode();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }



        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            URL url = new URL("");
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }

        try {
            int [] x = new int[-5];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            new Solution().clone();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }




        //напишите тут ваш код

    }
}
