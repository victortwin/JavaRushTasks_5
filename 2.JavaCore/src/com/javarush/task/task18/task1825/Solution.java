package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        BufferedOutputStream bos = null;
        String outName;

        try {

            while (!(buf = reader.readLine()).equals("end")) {
                Thread t = new ReadThread(buf);
                t.start();
                threads.add(t);

            }

            Collections.sort(threads, new Comparator<Thread>() {
                @Override
                public int compare(Thread o1, Thread o2) {
                    return getLastDidits(reverse(((ReadThread) o1).getFn().split("[.]")).get(0))
                            - getLastDidits(reverse(((ReadThread) o2).getFn().split("[.]")).get(0));
                }
            });


            String[] temp;
            String path = "";
            if (((ReadThread) threads.get(0)).getFn().contains("/")){
                temp = ((ReadThread) threads.get(0)).getFn().split("/");
                for (int i = 0; i < temp.length - 1; i++) {
                    path += temp[i] + "/";
                }
            } else{
                temp = ((ReadThread) threads.get(0)).getFn().split("[\\\\]");
                for (int i = 0; i < temp.length - 1; i++) {
                    path += temp[i] + "\\\\";
                }
            }

            String intermediate = temp[temp.length - 1].replace(".part1", "");
            outName = path + intermediate;
            bos = new BufferedOutputStream(new FileOutputStream(outName));
            List<Byte> lt = new ArrayList();
            for (Thread x : threads
            ) {
                lt = concat(lt,((ReadThread) x).getBuffer());

            }
            byte[] bbb = new byte[lt.size()];
            for (int i = 0; i < bbb.length; i++) {
                bbb[i] = lt.get(i);
            }
            bos.write(bbb, 0, bbb.length);

        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        } finally {
            try {
                reader.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> reverse(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list;
    }

    public static List<Byte> concat(List<Byte> list1, byte[] arr2) {

        for (int i = 0; i < arr2.length; i++) {
            list1.add(arr2[i]);
        }
        return list1;
    }


    public static int getLastDidits(String s) {
        return Integer.parseInt(s.replaceAll("part", ""));
    }

    public static class ReadThread extends Thread {
        private byte[] buffer;
        private String fn;
        BufferedInputStream bis;

        public String getFn() {
            return fn;
        }


        public ReadThread(String fn) throws FileNotFoundException {
            this.fn = fn;
            bis = new BufferedInputStream(new FileInputStream(fn));
        }

        public void run() {
            byte[] b;
            int size = 0;
            try {
                size = bis.available();
                b = new byte[size];
                bis.read(b);
                buffer = b;

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bis.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public byte[] getBuffer() {
            return buffer;
        }


    }


}


