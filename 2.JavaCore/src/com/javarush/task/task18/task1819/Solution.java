package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();
        reader.close();

        List<Integer> listRead = new ArrayList<>();
        int i = 0;
        FileInputStream fileInputStream = new FileInputStream(file1Name);
        BufferedInputStream  bufferedInputStream = new BufferedInputStream(fileInputStream);

        while ((i = bufferedInputStream.read()) != -1) {

            listRead.add(i);
        }
        fileInputStream.close();
        bufferedInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file1Name);
        FileInputStream fileInputStream2 = new FileInputStream(file2Name);

        while (fileInputStream2.available() > 0) {
            fileOutputStream.write(fileInputStream2.read());
        }
        for (Integer integer : listRead) {
            fileOutputStream.write(integer);
        }
        fileInputStream2.close();
        fileOutputStream.close();


    }
}
