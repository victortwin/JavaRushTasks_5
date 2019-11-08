package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);

        int count = 0;
        int b = 0;
        while ((b = inputStream.read()) != -1) {

            if ((b >= 65 && b <= 90) || (b >= 97 && b <= 122)) {
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}
