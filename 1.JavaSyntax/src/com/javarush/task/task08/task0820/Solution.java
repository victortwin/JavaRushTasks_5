package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<Cat>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);

        return catSet;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogSet= new HashSet<Dog>();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dogSet.add(dog1);
        dogSet.add(dog2);
        dogSet.add(dog3);

        return dogSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> mainSet = new HashSet<>();
        mainSet.addAll(cats);
        mainSet.addAll(dogs);
        return mainSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        pets.removeAll(cats);

        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object o:
             pets) {
            System.out.println(o);
        }

    }


    public static class Cat {

    }
    public static class Dog {

    }
}
