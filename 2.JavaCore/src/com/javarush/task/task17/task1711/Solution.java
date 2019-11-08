package com.javarush.task.task17.task1711;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static DateFormat parseFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут


        switch (args[0]) {

            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1) / 3; i++) {


                        if (args[2 + 3 * i].equals("м")) {

                            allPeople.add(Person.createMale(args[1 + 3 * i], parseFormat.parse(args[3 + i * 3])));
                        } else if (args[2 + 3 * i].equals("ж")) {
                            allPeople.add(Person.createFemale(args[1 + 3 * i], parseFormat.parse(args[3 + i * 3])));
                        }

                        System.out.println(allPeople.size() - 1);

                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i < (args.length - 1) / 3; i++) {


                        allPeople.get(Integer.parseInt(args[1 + i * 4])).setName(args[2 + i * 4]);

                        if (args[3 + i * 4].equals("м")) {
                            allPeople.get(Integer.parseInt(args[1 + i * 4])).setSex(Sex.MALE);
                        } else if (args[3 + i * 4].equals("ж")) {
                            allPeople.get(Integer.parseInt(args[1 + i * 4])).setSex(Sex.FEMALE);
                        }

                        allPeople.get(Integer.parseInt(args[1 + i * 4])).setBirthDate(parseFormat.parse(args[4 + i * 4]));
                    }
                    break;
                }


            case "-d":
                synchronized (allPeople) {
                    if (args.length > 1) {

                        for (int i = 1; i < args.length; i++) {

                            allPeople.get(Integer.parseInt(args[i])).setName(null);
                            allPeople.get(Integer.parseInt(args[i])).setSex(null);
                            allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);

                        }
                    }
                    break;
                }


            case "-i":
                synchronized (allPeople) {
                    if (args.length > 1) {

                        for (int i = 1; i < args.length; i++) {

                            System.out.print(allPeople.get(Integer.parseInt(args[i])).getName() + " ");

                            if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)) {

                                System.out.print("м" + " ");

                            } else if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.FEMALE)) {

                                System.out.print("ж" + " ");

                            }


                            System.out.print(dateFormat.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                            System.out.println();
                        }

                    }
                    break;
                }

            default:
                break;

        }
    }
}
