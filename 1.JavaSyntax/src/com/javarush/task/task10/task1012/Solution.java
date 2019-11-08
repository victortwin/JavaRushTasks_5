package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');




        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < alphabet.size(); i++) {

            int count = 0;
            for (int j = 0; j < list.size(); j++) {



                for (int k = 0; k < list.get(j).length(); k++) {

                    if(list.get(j).charAt(k) == alphabet.get(i)) {

                        count++;
                        map.put(alphabet.get(i), count);

                     }
                }
            }
        }

        for (int i = 0; i < alphabet.size() ; i++) {

            for (int j = 0; j < map.size(); j++) {

                if(!map.containsKey(alphabet.get(i))) {

                    map.put(alphabet.get(i), 0);

                }

            }

        }


        for (Character ch : alphabet) {
            System.out.println( ch + " " + map.get(ch));
        }


    }
}
