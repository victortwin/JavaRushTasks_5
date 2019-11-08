package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(file1Name);
        FileWriter fileWriter = new FileWriter(file2Name);

        while (fileReader.ready()) {


            int i = fileReader.read();
            i = fileReader.read();
            fileWriter.write(i);
        }
        fileReader.close();
        fileWriter.close();//
    }
}
