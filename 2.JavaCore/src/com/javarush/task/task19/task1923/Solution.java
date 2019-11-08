package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()) {

            String string = reader.readLine();
            String[] strings = string.split(" ");

            for (String s :
                    strings) {
                if (s.matches("(\\D*\\d+\\D*)+")) {
                    writer.write(s + " ");
                }
            }
        }
        reader.close();
        writer.close();

    }
}
