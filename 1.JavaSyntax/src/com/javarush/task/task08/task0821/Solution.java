package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Semenov", "Arcady");
        map.put("Semenov", "Andrew");
        map.put("Andreev", "Arcady");
        map.put("Twin", "Victor");
        map.put("Krasnov", "Paul");
        map.put("Ivantsov", "Vladimir");
        map.put("Guseynof", "Khafiz");
        map.put("Porshursky", "Peter");
        map.put("Ivanov", "Andrew");
        map.put("Semenov", "Gus");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
