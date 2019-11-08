package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        reader.close();

        reader = new BufferedReader(new FileReader(fileName1));

        List<String> list = new ArrayList<>();
        while (reader.ready()) {
            list.add(reader.readLine());
        }
        reader.close();
        List<String> result = new ArrayList<>();

        for (String s : list
             ) {
            result.add(s.replaceAll("\\.", "!"));
        }

        for (String s :
                result) {
            writer.write(s);
        }
        writer.close();
    }
}
