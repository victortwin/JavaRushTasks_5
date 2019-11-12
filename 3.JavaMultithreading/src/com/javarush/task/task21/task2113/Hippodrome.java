package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses = new ArrayList<>();


    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }
    static Hippodrome game;

    public Horse getWinner() {

        List<Double> maxDistanceList = new ArrayList();
        for (Horse h :
                horses) {
            maxDistanceList.add(h.getDistance());
        }
        double maxDistance = Collections.max(maxDistanceList);

        for (Horse h :
                horses) {
            if (h.getDistance() == maxDistance) {
                return h;
            }
        }
        return null;
        //return horses.stream().max(Comparator.comparing(Horse::getDistance)).orElse(null);
    }
    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    void move() {
        for (Horse h :
                horses) {
            h.move();
            h.print();
        }

    }
    void print() {

        for (Horse h :
                horses) {

            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("Good", 3.0, 0.0);
        Horse horse2 = new Horse("Bad", 3.0, 0.0);
        Horse horse3 = new Horse("Ugly", 3.0, 0.0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();
    }

}
