package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталло", dateFormat.parse("MAY 1 2012"));
        map.put("Сталл", dateFormat.parse("JULY 1 2012"));
        map.put("Стал", dateFormat.parse("MAY 1 2012"));
        map.put("Ста", dateFormat.parse("AUGUST 1 2012"));
        map.put("Ст", dateFormat.parse("MAY 1 2012"));
        map.put("С", dateFormat.parse("MAY 1 2012"));
        map.put("Нестал", dateFormat.parse("MAY 1 2012"));
        map.put("Ябынестал", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            /*Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if(date.getMonth() < 8 && date.getMonth() > 4 ) {
                map.remove(pair.getKey());
            }*/
            Date date = iterator.next().getValue();
            if(date.getMonth() < 8 && date.getMonth() > 4 ) {
                iterator.remove();
            }
        }
      /* for (Map.Entry<String, Date> pair:
             map.entrySet()) {
            Date date = pair.getValue();
            if(date.getMonth() < 8 && date.getMonth() > 4 ) {
                map.remove(pair.getKey());
            }

        }*/
    }

    public static void main(String[] args) throws ParseException {
/*
        Map<String, Date> map = createMap();

        System.out.println(map);

        removeAllSummerPeople(map);

        System.out.println(map);*/

    }
}
