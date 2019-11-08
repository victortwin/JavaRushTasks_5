package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);


        int counter = 0;
        StringBuilder file = new StringBuilder();

        while (fileReader.ready()) {


             file.append((char)fileReader.read());
        }
        fileReader.close();
        String fileString = file.toString();
        int beginLength = fileString.length();
        String result = fileString.replaceAll("\\bworld\\b", "");
        int endLength = result.length();
        counter = (beginLength - endLength) / 5;
        System.out.println(counter);


    }
}
