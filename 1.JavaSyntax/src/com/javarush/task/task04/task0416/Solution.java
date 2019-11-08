package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sTime = reader.readLine();
        double time = Double.parseDouble(sTime);

        if (time % 5 >= 0 && time % 5 <3) {
            System.out.println("зелёный");
        }
        else if (time % 5 < 4) {
            System.out.println("жёлтый");
        } else System.out.println("красный");


    }
}