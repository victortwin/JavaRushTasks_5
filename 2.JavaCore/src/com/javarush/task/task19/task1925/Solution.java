package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();
        List<String[]> list = new ArrayList<>();
        while (reader.ready()) {

            list.add(reader.readLine().split( " "));


        }
        reader.close();

        for (String[] sArr :
                list) {
            for (String s :
                    sArr) {
                if (s.length() > 6) {

                    stringBuilder.append(s);
                    stringBuilder.append(",");
                }
            }


        }
        stringBuilder.deleteCharAt(stringBuilder.toString().length() - 1);
        writer.write(stringBuilder.toString());

        writer.close();

    }
}
