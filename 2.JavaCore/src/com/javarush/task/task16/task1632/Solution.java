package com.javarush.task.task16.task1632;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);


    static {
        Thread t1 = new Thread1();
        threads.add(t1);
        Thread t2 = new Thread2();
        threads.add(t2);
        Thread t3 = new Thread3();
        threads.add(t3);
        Thread t4 = new Thread4();
        threads.add(t4);
        Thread t5 = new Thread5();
        threads.add(t5);

    }
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                /*
                if(isInterrupted()) {
                    System.out.println("InterruptedException");
                }*/
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {

                try {
                    System.out.println("Ура");
                    sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                   // interrupt();
                }
            }
        }
    }
    public static class Thread4 extends Thread implements Message {
        boolean repeat = true;

        @Override
        public void showWarning() {
            repeat = false;
        }

        @Override
        public void run() {
            while (repeat);
        }
    }
    public static class Thread5 extends Thread {


        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int result = 0;
            while (true){
                try {
                    String s = reader.readLine();
                    try {
                        result += Integer.parseInt(s);
                    }catch (NumberFormatException e) {
                        break;
                    }

                    if (s.equals("N")) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
    }
}