package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        String[] array = {a, b, c};


        if ((!array[0].equals(array[1]) || !array[0].equals(array[2])) && array[1].equals(array[2])) {
            System.out.println(1);
        } else if ((!array[1].equals(array[0]) || !array[1].equals(array[2])) && array[0].equals(array[2])) {
            System.out.println(2);
        } else if ((!array[2].equals(array[0]) || !array[2].equals(array[1])) && array[0].equals(array[1])) {
            System.out.println(3);
        }

    }
}
