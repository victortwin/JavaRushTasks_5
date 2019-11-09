package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", ".txt", new File("e:\\test\\"));
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User ivanov = new User();
            ivanov.setFirstName("Ivan");
            ivanov.setLastName("Ivanov");
            //ivanov.setBirthDate(new Date(150894451616L));
            ivanov.setBirthDate(new GregorianCalendar(1980, Calendar.MARCH, 28).getTime());
            ivanov.setCountry(User.Country.UKRAINE);
            ivanov.setMale(true);
            User petrova = new User();
            petrova.setFirstName("Tanja");
            petrova.setLastName("Petrova");
            petrova.setMale(false);
            javaRush.users.add(ivanov);
            javaRush.users.add(petrova);
            javaRush.users.add(new User());
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            for (User j : javaRush.users) {
                System.out.println(j.getFirstName() + " " + j.getLastName() + " " + j.getBirthDate() + " " + j.getCountry() + " " + j.isMale());
            }
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println("loadedObject.users:");
            for (User j: loadedObject.users){
                System.out.println(j.getFirstName()+" "+j.getLastName()+" "+j.getBirthDate()+" "+j.getCountry() + " "+j.isMale());
            }

            System.out.println(loadedObject.equals(javaRush));
            System.out.println(loadedObject.hashCode()==javaRush.hashCode());
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            if (this.users.size() > 0) {

                PrintWriter printWriter = new PrintWriter(outputStream);
                StringBuilder sb = new StringBuilder();
                for (User u :
                        this.users) {
                    sb.append(u.getFirstName());
                    sb.append("#");
                    sb.append(u.getLastName());
                    sb.append("#");
                    sb.append((u.getBirthDate() != null) ? u.getBirthDate().getTime() : null);
                    sb.append("#");
                    sb.append(u.isMale());
                    sb.append("#");
                    sb.append(u.getCountry() != null ? u.getCountry().getDisplayName() : null);
                    sb.append("#");
                }

                printWriter.print(sb);
                printWriter.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder input = new StringBuilder();
            while (reader.ready()) {
                input.append(reader.readLine());
            }

            reader.close();
            if(input.length() > 0) {
                String[] inputArr = input.toString().split("#");


                //SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

                    this.users = new ArrayList<>();
                    if(inputArr.length > 0) {

                        for (int i = 0; i < inputArr.length; i += 5) {

                            User user = new User();

                            String firstName = inputArr[i].equals("null") ? null : inputArr[i];
                            user.setFirstName(firstName);

                            String lastName = inputArr[i + 1].equals("null") ? null : inputArr[i + 1];
                            user.setLastName(lastName);
                            if (!inputArr[i + 2].equals("null")) {
                                Date birthDate = new Date(Long.parseLong(inputArr[i + 2]));
                                user.setBirthDate(birthDate);
                            }

                            boolean isMale = inputArr[i + 3].equals("true");
                            user.setMale(isMale);

                            if (!inputArr[i + 4].equals("null") ) {
                                User.Country country = User.Country.valueOf(inputArr[i + 4].toUpperCase());
                                user.setCountry(country);
                            }


                            this.users.add(user);
                        }
                    }

                }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
