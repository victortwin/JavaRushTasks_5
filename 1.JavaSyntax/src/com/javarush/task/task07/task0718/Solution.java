package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList<>();
            int index = 0;
            boolean isDisorder = false;
            for (int i = 0; i < 10; i++) {
                list.add(reader.readLine());
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if(list.get(i + 1).length() < list.get(i).length()) {
                    index = i + 1;
                    isDisorder = true;
                    break;
                }
            }
            if (isDisorder) {
                System.out.println(index);
            }

        }
}


