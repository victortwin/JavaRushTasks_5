package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listRemaining = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }
        for (int n : mainList) {
            if(n % 3 == 0) {
                list3.add(n);
            }
        }
        for (int n : mainList) {
            if(n % 2 == 0) {
                list2.add(n);
            }
        }
        for (int n : mainList) {
            if(n % 3 != 0 && n % 2 != 0) {
                listRemaining.add(n);
            }
        }
        printList(list3);
        printList(list2);
        printList(listRemaining);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int n: list) {
            System.out.println(n);
        }
    }
}
