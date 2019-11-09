package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

//    static
//    {
//        properties.put("ras","ros");
//        properties.put("ros","ras");
//    }

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        load(fileInputStream);
        fileInputStream.close();

        //implement this method - реализуйте этот метод

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
//        properties = p.entrySet().stream().collect(Collectors.toMap(
//                e -> String.valueOf(e.getKey()),
//                e -> String.valueOf(e.getValue())));
//        p.store(outputStream, "save properties");

        for (Map.Entry<String, String> pair : properties.entrySet()) {
            p.setProperty(pair.getKey(), pair.getValue());
        }
        //p.putAll(properties);
        p.store(outputStream, "comment");


    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        p.load(inputStream);
      //  p.putAll(properties);
//        for (String s : p.stringPropertyNames())
//        {
//           properties.put(s, p.getProperty(s));
//
//        }
        properties = new HashMap(p);
    }

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution();
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\test\\result.txt");
        solution.fillInPropertiesMap();
        solution.save(fileOutputStream);
        fileOutputStream.flush();



    }
}
