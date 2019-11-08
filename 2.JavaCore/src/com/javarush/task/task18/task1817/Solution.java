package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);

        int count = 0;
        int spaceCount = 0;
        int b = 0;
        while ((b = inputStream.read()) != -1) {

            count++;
            if (b == ' ') {
                spaceCount++;
            }
        }
        System.out.printf("%.2f", (float) (spaceCount * 100.0 / count) );
        inputStream.close();
    }
}
