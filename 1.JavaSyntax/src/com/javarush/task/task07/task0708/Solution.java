package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int maxLength = strings.get(0).length();
        for (int i = 1; i < 5; i++) {

            if(strings.get(i).length() > strings.get(i-1).length()) {
                maxLength = strings.get(i).length();
            }
        }
        for (String s : strings) {
            if (s.length() == maxLength) {
                System.out.println(s);
            }
        }
    }
}
