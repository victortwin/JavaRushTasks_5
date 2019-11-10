package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        Object loadedObj = null;
        try {
            loadedObj = objectStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        if (! (loadedObj instanceof A)) {
            return null;
        }
        return (A) loadedObj;

    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
