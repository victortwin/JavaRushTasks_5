package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String s = "";
            while (s != null) {
                 s = reader.readLine();
                 if(s != null) {
                     lines.add(s);
                 }


            }




        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
