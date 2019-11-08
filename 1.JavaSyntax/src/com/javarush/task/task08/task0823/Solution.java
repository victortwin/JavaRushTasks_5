package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        if (string.length() != 0) {
            char[] charArray = string.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            for (int i = 0; i < string.length()-1; i++) {
                //
                if (charArray[i] == ' ') {
                    charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
                }

            }
            string = new String(charArray);
            System.out.println(string);
        }
        //else System.out.println("Хуйболла");


        //напишите тут ваш код
    }
}
