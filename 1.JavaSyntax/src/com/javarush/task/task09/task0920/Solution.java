package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args)  {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException has been caught");
            }

            //напишите тут ваш код
        }
    }
}
