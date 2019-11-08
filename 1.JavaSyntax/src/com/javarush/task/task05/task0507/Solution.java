package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while (true) {

            String sNum = reader.readLine();
            int num = Integer.parseInt(sNum);

            if (num != -1) {
                sum += num;
                count++;
            } else {
                if (count == 0) count = 1;
                System.out.println(sum/count);
                break;
            }




        }
    }
}

