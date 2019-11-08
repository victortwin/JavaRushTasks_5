package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileName));
        int counter = 0;
        while (reader.ready()) {

            String string = reader.readLine();
            String[] strArr = string.split(" ");
            for (String s: words
                 ) {
                for (String s1: strArr
                     ) {
                    if (s.equals(s1)) {
                        counter++;
                    }
                }
            }
            if (counter == 2) {
                System.out.println(string);
            }
            counter = 0;
        }
        reader.close();

    }
}
