package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName);

        List<Integer> byteArray = new ArrayList<>();
        while (inputStream.available() > 0) {

            byteArray.add(inputStream.read());
        }
        inputStream.close();

       Set<Integer> mySet = new TreeSet<>();

       mySet.addAll(byteArray);

        for (Object o: mySet.toArray()
             ) {
            System.out.print(o + " ");
        }

        //System.out.println(mySet.);
    }
}
