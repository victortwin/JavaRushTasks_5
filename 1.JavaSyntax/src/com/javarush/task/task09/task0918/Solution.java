package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends ArithmeticException {
    }

    static class MyException2 extends NullPointerException {
    }

    static class MyException3 extends FileNotFoundException {
    }

    static class MyException4 extends EOFException {
    }
}

