package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1Name = reader.readLine();
        String file2Name = reader.readLine();

        reader = new BufferedReader(new FileReader(file1Name));
        String nums = reader.readLine();
        String[] numsArr = nums.split(" ");

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2Name));

        for(int i = 0; i < numsArr.length; i++) {
            writer.write(Math.round(Double.parseDouble(numsArr[i])) + " ");
        }
        reader.close();
        writer.close();
    }
}
