package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String sRead = "";
        String fileName = reader.readLine();
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        do {
            sRead = reader.readLine();
            bufferedWriter.write(sRead + "\n");
        }
        while (!sRead.equals("exit"));
        bufferedWriter.close();


    }
}
