package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        //Calendar calendar = new GregorianCalendar(Integer.parseInt(args[2].substring(6)), (Integer.parseInt(args[2].substring(3, 5)) - 1), Integer.parseInt(args[2].substring(0, 2)));
        DateFormat parseFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


        if (args.length > 0 && args[0].equals("-c")) {

            if (args[2].equals("м")) {

                allPeople.add(Person.createMale(args[1], parseFormat.parse(args[3])));
            }
            else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], parseFormat.parse(args[3])));
            }

            System.out.println(allPeople.size() - 1);


        }
        else if (args.length > 0 && args[0].equals("-u")) {

            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);

            if (args[3].equals("м")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            }
            else if (args[3].equals("ж")){
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }

            allPeople.get(Integer.parseInt(args[1])).setBirthDate(parseFormat.parse(args[4]));

            //System.out.println(allPeople.get(1).getName() + allPeople.get(1).getSex() + allPeople.get(1).getBirthDate());

        }

        else if (args.length > 0 && args[0].equals("-d")) {


            if(args.length > 1) {

                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
            }

        }

        else if (args.length > 0 && args[0].equals("-i")) {

            if(args.length > 1) {

                System.out.print(allPeople.get(Integer.parseInt(args[1])).getName() + " ");

                if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)) {

                    System.out.print("м" + " ");

                }
                else if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.FEMALE)) {

                    System.out.print("ж" + " ");

                }


                System.out.print(dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));

            }

        }


    }


}
