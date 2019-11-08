package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] iArray = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < iArray.length; i ++) {
            iArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = iArray.length - 1; i >= 0; i--) {
            System.out.println(iArray[i]);
        }
    }
}

