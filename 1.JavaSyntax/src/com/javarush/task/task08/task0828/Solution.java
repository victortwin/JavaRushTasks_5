package com.javarush.task.task08.task0828;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> monthList = new ArrayList<>();

        String month = reader.readLine();

        monthList.add(month);

        int i = Collections.indexOfSubList(months, monthList);
        //i++;

        System.out.println(month + " is the " + (i + 1) + " month");

    }
}
