package com.javarush.task.task17.task1721;

import java.beans.Transient;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();

        reader.close();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1Name)));

        //BufferedReader file2Reader =

        while (fileReader.ready()) {
            allLines.add(fileReader.readLine());
        }

        fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2Name)));

        while (fileReader.ready()){
            forRemoveLines.add(fileReader.readLine());
        }

        fileReader.close();

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e){
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {

        int stringCounter = 0;
        for (String s: forRemoveLines
             ) {
            if (allLines.contains(s)) {
                stringCounter++;
            }
        }
        if (stringCounter == forRemoveLines.size()) {
            for (String s : forRemoveLines
                 ) {
                allLines.remove(s);
            }
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();

        }

    }
}
