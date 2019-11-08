package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        List<String> strings = new ArrayList<>();

        //тут цикл по чтению ключей, пункт 1
        while (true) {

            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger")) {

                strings.add(key);

            }
            else  break;
        }

            //создаем объект, пункт 2
        for (String s: strings
             ) {
            switch (s) {
                case "user" :
                    Person.User user = new Person.User();
                    person = user;
                    doWork(person); //вызываем doWork
                    break;
                case "loser" :
                    Person.Loser loser = new Person.Loser();
                    person = loser;
                    doWork(person); //вызываем doWork
                    break;
                case "coder" :
                    Person.Coder coder = new Person.Coder();
                    person = coder;
                    doWork(person); //вызываем doWork
                    break;
                case "proger" :
                    Person.Proger proger = new Person.Proger();
                    person = proger;
                    doWork(person); //вызываем doWork
                    break;
                default:
                    break;
            }
        }




    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }
        else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
