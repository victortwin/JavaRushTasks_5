package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private Human father;
        private Human mother;
        private boolean sex;
        private String eyesColor;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, String eyesColor) {
            this.name = name;
            this.sex = sex;
            this.eyesColor = eyesColor;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(boolean sex, String eyesColor) {
            this.sex = sex;
            this.eyesColor = eyesColor;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, boolean sex, String eyesColor) {
            this.age = age;
            this.sex = sex;
            this.eyesColor = eyesColor;
        }

        public Human(String name, String eyesColor) {
            this.name = name;
            this.eyesColor = eyesColor;
        }
    }
}
