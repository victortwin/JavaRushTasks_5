package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandpa, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandma);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat dad;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat dad, Cat mother) {
            this.name = name;
            this.dad = dad;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (dad == null && mother == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (dad == null && mother !=  null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else if (mother == null && dad !=  null)
                return "The cat's name is " + name + ", no mother, father is " + dad.name;
            else  return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + dad.name;
        }
    }

}
