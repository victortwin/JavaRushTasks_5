package com.javarush.task.task13.task1301;

/* 
Пиво
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void sleepOnTheFloor() {

            System.out.println("Holy fucking shit! I wold sleep here on the floor...");

        }

        @Override
        public void askForMore(String message) {

            System.out.println("Hey garcon! One more glass, please!!");

        }

        @Override
        public void sayThankYou() {

            System.out.println("God bless you, man!");

        }

        @Override
        public boolean isReadyToGoHome() {

            return READY_TO_GO_HOME;
        }
    }
}