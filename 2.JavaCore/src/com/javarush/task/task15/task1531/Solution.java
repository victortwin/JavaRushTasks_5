package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        if (n == 0) return "1";
        else if (n < 0) return "0";

        else {
            //return "" + (n * Integer.parseInt(factorial(n-1)) );
            return new BigInteger(factorial(n - 1)).multiply(BigInteger.valueOf(n)).toString();
        }


    }
}
