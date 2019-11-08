package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<String, Double> myTreeMap = new TreeMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));


        while (reader.ready()) {
            String str = reader.readLine();
            String[] splitStr = str.split(" ");


            myTreeMap.computeIfPresent(splitStr[0], (a, b) -> b += Double.parseDouble(splitStr[1]));
            myTreeMap.computeIfAbsent(splitStr[0], b -> Double.parseDouble(splitStr[1]));

        }
        reader.close();
        for (Map.Entry pair: myTreeMap.entrySet()
             ) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
