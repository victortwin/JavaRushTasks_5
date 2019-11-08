package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filName = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(filName);

        List<Integer> byteArray = new ArrayList<>();
        while (inputStream.available() > 0) {

            byteArray.add(inputStream.read());
        }
        inputStream.close();
        Collections.sort(byteArray);
        System.out.println(byteArray.get(0));
    }
}
