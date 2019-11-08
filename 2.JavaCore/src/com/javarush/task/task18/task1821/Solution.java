package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);

        List<Character> byteArray = new ArrayList<>();
        while (inputStream.available() > 0) {

            byteArray.add((char) inputStream.read());
        }
        inputStream.close();

        Map<Character, Integer> myMap = new TreeMap<>();
        for (int i = 0; i < byteArray.size(); i++){

            myMap.put(byteArray.get(i), Collections.frequency(byteArray, byteArray.get(i)));
        }
        //int maxFreq = Collections.max(myMap.values());

        for (Map.Entry pair: myMap.entrySet()
        ) {

                System.out.println(pair.getKey() + " " + pair.getValue());

        }
    }
}
