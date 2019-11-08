package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1name = reader.readLine();
        String file2name = reader.readLine();
        String file3name = reader.readLine();

        reader.close();

        FileInputStream fileInputStream = new FileInputStream(file2name);
        FileOutputStream fileOutputStream = new FileOutputStream(file1name);
        while (fileInputStream.available() > 0) {

            fileOutputStream.write(fileInputStream.read());
        }
        fileInputStream.close();
        fileInputStream = new FileInputStream(file3name);
        fileOutputStream = new FileOutputStream(file1name, true);
        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
