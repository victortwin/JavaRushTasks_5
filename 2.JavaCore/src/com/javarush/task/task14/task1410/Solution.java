package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() { // must return object of type Wine

        Drink drink = new Wine();
        return drink;
    }

    public static Wine getWine() { // must return object of type Wine

        Wine wine = new Wine();
        return wine;
    }

    public static Wine getBubblyWine() { // must return object of type BubblyWine

        BubblyWine bubblyWine = new BubblyWine();
        return bubblyWine;
    }
}
