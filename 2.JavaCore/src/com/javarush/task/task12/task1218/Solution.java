package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {
            System.out.println("I'm running like a dog");
        }
        public void eat() {
            System.out.println("omnomnom, bowow!");
        }
    }

    public class Duck implements CanFly, CanEat, CanMove {

        @Override
        public void fly() {
            System.out.println("Fly like a duck!");
        }

        @Override
        public void eat() {
            System.out.println("я жру как утка");
        }

        @Override
        public void move() {

        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
