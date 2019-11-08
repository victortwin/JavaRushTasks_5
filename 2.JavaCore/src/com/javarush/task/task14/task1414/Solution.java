package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> keys = new ArrayList<>();
        String key;

        while (true) {
            key = reader.readLine();
            if (key.equals("cartoon") || key.equals("soapOpera") || key.equals("thriller")) {
                keys.add(key);
            }
            else{
                 keys.add(key);
                 break;
            }
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */



            for (String s: keys
            ) {
                if (s.equals("cartoon") || key.equals("soapOpera") || key.equals("thriller")) {
                    Movie movie = MovieFactory.getMovie(s);
                    System.out.println(movie.getClass().getSimpleName());
                }
                else
                    try {
                        Movie movie = MovieFactory.getMovie(s);
                        movie.getClass().getSimpleName();
                     }catch (NullPointerException e) {
                        //System.out.println("NullPointerException has been caught.");
                        break;
                    }

             }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }




            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }
    static class Cartoon extends Movie {
    }
    static class Thriller extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
}
