package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i = 0; i < strings.size(); ) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) {
                strings.remove(i);

            }
            else if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {
                strings.add(i+1, strings.get(i));
                i +=2;
            }
            else if(strings.get(i).contains("р") && strings.get(i).contains("л")) {
                i++;
            }
            else i++;

        }
        return strings;
    }
}