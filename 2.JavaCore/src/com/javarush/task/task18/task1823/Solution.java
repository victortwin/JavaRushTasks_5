package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sRead = "";
        List<String> fileNames = new ArrayList<>();

        while (!(sRead = reader.readLine()).equals("exit")) {

            fileNames.add(sRead);
        }
        reader.close();

        for (String s: fileNames
             ) {
            new ReadThread(s).start();
        }
    }

    public static class ReadThread extends Thread {

        String fileName = "";
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        @Override
        public void run() {
            List<Integer> byteArray = new ArrayList<>();
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);


                while (fileInputStream.available() > 0) {
                    byteArray.add(fileInputStream.read());
                }
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Map<Integer, Integer> myMap = new HashMap<>();
            for (int i = 0; i < byteArray.size(); i++){

                myMap.put(byteArray.get(i), Collections.frequency(byteArray, byteArray.get(i)));
            }
            int maxFreq = Collections.max(myMap.values());

            for (Map.Entry pair: myMap.entrySet()
            ) {
                if (pair.getValue().equals(maxFreq)) {
                    //System.out.print(pair.getKey() + " ");
                    resultMap.put(fileName, (Integer) pair.getKey());
                }
            }





        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
