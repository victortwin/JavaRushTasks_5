package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int maxLength = list.get(0).length(), minLength = list.get(0).length();

        for (int i = 1; i < 10; i++) {
            if(list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
            }
            if(list.get(i).length() < minLength) {
                minLength = list.get(i).length();
            }
        }
        for (String s : list) {
            if (s.length() == maxLength || s.length() == minLength) {
                System.out.println(s);
                break;
            }
        }

    }
}
