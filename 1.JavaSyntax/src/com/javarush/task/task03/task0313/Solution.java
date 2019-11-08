package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String [] s = {"Мама", "Мыла", "Раму"};
        String bufer;
        for (int i = 0; i < 3; i++) {

            System.out.println(s[0] + s[1] +s [2]);

            System.out.println(s[0] + s[2] +s [1]);

            bufer = s[0];
            s[0] = s[1];
            s[1] = s[2];
            s[2] = bufer;

        }
    }
}
