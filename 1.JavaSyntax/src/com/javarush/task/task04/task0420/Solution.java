package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String sA = reader.readLine();
            String sB = reader.readLine();
            String sC = reader.readLine();

            int a = Integer.parseInt(sA);
            int b = Integer.parseInt(sB);
            int c = Integer.parseInt(sC);
            int buffer = 0;

            int [] array = {a , b, c};


            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < (array.length); j++) {
                    if(array[i] < array[j]) {
                        buffer = array [j];
                        array[j] = array[i];
                        array[i] = buffer;
                    }
                }


            }

            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i] + " ");
            }




    }
}
