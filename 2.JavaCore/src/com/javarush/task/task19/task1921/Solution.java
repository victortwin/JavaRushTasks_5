package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");

        while (reader.ready()) {
            String string = reader.readLine();
            String name;
            String dateStr;
            Date birthDate;
            name = string.replaceAll("\\d", "").trim();

            //dateStr = string.replaceAll("\\D", "");

            Pattern p = Pattern.compile("\\d");
            Matcher m = p.matcher(string);
            int datePosition = 0;
            while (m.find()) {
                datePosition = m.start();
                break;
            }
            String date = string.substring(datePosition);
            String[] dateStrArr = date.split(" ");
            String day = dateStrArr[0];
            String month = dateStrArr[1];
            String year = dateStrArr[2];

            String birthDateStr = day + " " + month + " " + year;

            birthDate = simpleDateFormat.parse(birthDateStr);


                //birthDate.setMonth(birthDate.getMonth() + 1);




            Person person = new Person(name, birthDate);
            PEOPLE.add(person);
        }
        reader.close();

    }
}
