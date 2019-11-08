package com.javarush.task.task19.task1920;

/* 
Самый богатый
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
        double max = 0.0;
        for (Map.Entry pair : myTreeMap.entrySet()
             ) {

            if ((double)pair.getValue() > max) {
                max = (double) pair.getValue();
            }
        }
        //double max = Collections.max(myTreeMap.values());
        reader.close();
        for (Map.Entry pair: myTreeMap.entrySet()
        ) {
            if (pair.getValue().equals(max))
            System.out.println(pair.getKey());
        }

    }
}
