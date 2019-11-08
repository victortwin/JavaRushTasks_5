package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        int data = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> listEven = new ArrayList<>();


        while (fileReader.ready()) {
            data = Integer.parseInt(fileReader.readLine());
            list.add(data);
        }
        //System.out.println(list);


        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) % 2 == 0) {
                listEven.add(list.get(i));
            }
        }
        //System.out.println(listEven);

        //Arrays.sort(list.toArray());


        Collections.sort(listEven);
        //System.out.println(listEven);

        for (int x : listEven
             ) {
            System.out.println((x));
        }


        fileReader.close();
        reader.close();



    }
}
