package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        for(int i = 0; i < 5; i ++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int sortBuffer = 0;

        for(int i = 0; i < 4; i ++) {
            for (int j = i + 1; j < 5; j ++) {
                if (array[i] > array[j]) {
                    sortBuffer = array[i];
                    array[i] = array[j];
                    array[j] = sortBuffer;
                }
            }
        }
        for (int number : array) {
            System.out.println(number);
        }
    }
}
