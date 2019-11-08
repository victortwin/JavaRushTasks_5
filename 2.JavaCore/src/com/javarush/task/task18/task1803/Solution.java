package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
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

        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < byteArray.size(); i++){

            myMap.put(byteArray.get(i), Collections.frequency(byteArray, byteArray.get(i)));
        }
        int maxFreq = Collections.max(myMap.values());

        for (Map.Entry pair: myMap.entrySet()
             ) {
            if (pair.getValue().equals(maxFreq)) {
                System.out.print(pair.getKey() + " ");
            }
        }

    }
}
