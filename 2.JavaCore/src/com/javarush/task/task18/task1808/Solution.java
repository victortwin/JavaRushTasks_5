package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();
        String file3Name = reader.readLine();

        reader.close();

        FileInputStream fileInputStream = new FileInputStream(file1Name);
        int quantity = fileInputStream.available();
        byte[] buffer2 = new byte[fileInputStream.available() / 2];
        byte[] buffer1 = new byte[fileInputStream.available() / 2 + quantity % 2];

        fileInputStream.read(buffer1);

        FileOutputStream fileOutputStream = new FileOutputStream(file2Name);
        fileOutputStream.write(buffer1);

        fileInputStream.read(buffer2);

        FileOutputStream fileOutputStream2 = new FileOutputStream(file3Name);
        fileOutputStream2.write(buffer2);

        fileInputStream.close();
        fileOutputStream.close();
        fileOutputStream2.close();

    }
}
