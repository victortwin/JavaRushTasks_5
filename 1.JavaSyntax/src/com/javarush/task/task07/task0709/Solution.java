package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {

    static int min;

    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {
            arrayList.add(br.readLine());
        }

        min = arrayList.get(0).length();

        for (int i = 1; i < arrayList.size(); i++) {

            if (arrayList.get(i).length() < min) {
                min = arrayList.get(i).length();
            }
        }

        for (String name :
                arrayList) {
            if (name.length() == min) {

                System.out.println(name);
            }


        }
    }
}