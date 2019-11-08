package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        while (reader.ready()) {

            list.add(reader.readLine());
        }

        reader.close();

        for (String s: list
             ) {
            //sb.append(s);
            System.out.println(new StringBuilder(s).reverse());
            //sb.delete(0, sb.length() - 1);
        }
    }
}
