package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int victoryFactor = 0;
        int anotherFactor = 0;
        if (this.age > anotherCat.age){
            victoryFactor++;
        } else if (anotherCat.age > this.age) anotherFactor ++;
        if (this.weight > anotherCat.weight) {
            victoryFactor++;
        } else if (anotherCat.weight > this.weight) anotherFactor++;
        if (this.strength > anotherCat.strength) {
            victoryFactor++;
        } else if (anotherCat.strength > this.strength) anotherFactor++;
        if (victoryFactor > anotherFactor) {
            return true;
        }else return false;
    }

    public static void main(String[] args) {

    }
}
