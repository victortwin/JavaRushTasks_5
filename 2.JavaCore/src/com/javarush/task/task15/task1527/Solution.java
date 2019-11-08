package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        List<String> numbers = new ArrayList<>();


        if (s.contains("?") && s.indexOf("?") + 1 < s.length()) {

            String [] params = s.substring(s.indexOf("?") + 1).split("&");

            for (String sub : params) {

                if (sub.contains("=")) {

                    System.out.print(sub.substring(0, sub.indexOf("=")));
                }
                else {
                    System.out.print(sub);
                }

                if (sub.contains("obj")) {

                    String numStr = sub.substring((sub.indexOf("=") + 1));

                    /*if (numStr.contains(".") || numStr.contains([0-9])) {


                        try {
                            double dNum = Double.parseDouble(numStr);
                            //alert(dNum);
                            numbers.add(dNum);
                        } catch (NumberFormatException e) {
                            numbers.add(numStr);
                        }


                    } else {

                        //alert(numStr);
                        numbers.add(numStr);

                    }*/
                    numbers.add(numStr);

                }
                System.out.print(" ");

            }
            System.out.println("");
            for (String ss: numbers
                 ) {

                try {
                    alert(Double.parseDouble(ss));
                }catch (NumberFormatException e) {
                    alert(ss);
                }
            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
