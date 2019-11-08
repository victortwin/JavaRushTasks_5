package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        ArrayList<Human> childrenOfchild = new ArrayList<>();
        ArrayList<Human> childGen2 = new ArrayList<>();

        Human child1 = new Human("Peter", true, 5, childrenOfchild);
        Human child2 = new Human("Paul", true, 6, childrenOfchild);
        Human child3 = new Human("Klara", false, 2, childrenOfchild);

        childGen2.add(child1);
        childGen2.add(child2);
        childGen2.add(child3);

        Human father = new Human("Andrew", true, 30, childGen2);
        Human mother = new Human("Larissa", false, 23, childGen2);

        ArrayList<Human> childGen1 = new ArrayList<>();
        childGen1.add(father);
        ArrayList<Human> childGen11 = new ArrayList<>();
        childGen11.add(mother);

        Human grandpa1 = new Human("Basil", true, 60, childGen1);
        Human grandma1 = new Human("Hannah", false, 57, childGen1);

        Human grandpa2 = new Human("Daniel", true, 88, childGen11);
        Human grandma2 = new Human("Barbara", false, 76, childGen11);
        System.out.println(grandpa1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        /*public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }*/

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
