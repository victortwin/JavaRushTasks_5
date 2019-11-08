package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new int[20];
        int[] smallAray1 = new int[10];
        int[] smallArray2 = new int[10];
        int j = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 20; i ++) {
            if (i < 10) {
                smallAray1[i] = bigArray[i];
            }
            else {
                smallArray2 [j] = bigArray[i];
                j++;
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(smallArray2[i]);
        }

    }
}
