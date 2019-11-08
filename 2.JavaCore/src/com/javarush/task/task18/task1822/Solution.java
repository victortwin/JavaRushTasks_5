package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
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
        reader = new BufferedReader(new FileReader(fileName));
        List<String> list = new ArrayList<>();
        String s;
        while ( ( s = reader.readLine()) != null) {
            list.add(s);
        }

        for (String str: list
             ) {
            if (str.startsWith(args[0] + " ")) {
                System.out.println(str);
            }
        }
        reader.close();
    }
}
