package com.vladyslavmelnikov.csvreader.functional;

import com.vladyslavmelnikov.csvreader.model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class ReaderCsvFunc {
    public LinkedList<Person> CSVReader(String filePath) {
        BufferedReader reader = null;
        String line = "";
        LinkedList<Person> people = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                LinkedList<String> row = Arrays.stream(line.split(";")).collect(Collectors.toCollection(LinkedList::new));
                String personName = row.remove(0);
                LinkedList<Float> wallet = new LinkedList<>();
                for (String money : row) {
                    if (money.contains("m")) {
                        wallet.add(Float.parseFloat(money.replace("m", "")) / 100);
                    } else {
                        wallet.add(Float.parseFloat(money));
                    }
                }
                people.add(new Person(personName, wallet));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return people;
    }

}
