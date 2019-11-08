package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int a;
    short b;
    long c;

    public Solution(){

    };

    Solution(int a){
        this.a = a;
    };
    protected Solution(short b){
        this.b = b;
    };
    private Solution(long c){
        this.c = c;

    };




    public static void main(String[] args) {

    }
}

