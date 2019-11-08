package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1Name);
        FileOutputStream fileOutputStream = new FileOutputStream(file2Name);

        byte [] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        for (int i = buffer.length - 1; i >= 0; i--) {

            fileOutputStream.write(buffer[i]);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
