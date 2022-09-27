package com.vladyslavmelnikov.csvreader;

import com.vladyslavmelnikov.csvreader.functional.OutputingFunc;
import com.vladyslavmelnikov.csvreader.functional.ReaderCsvFunc;
import com.vladyslavmelnikov.csvreader.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


//@SpringBootApplication
public class CsvReaderApplication {

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        ReaderCsvFunc readerCsvFunc = new ReaderCsvFunc();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write name please: ");
        String name = scanner.nextLine();
        people = readerCsvFunc.CSVReader("D:\\oop\\csv-reader\\src\\main\\resources\\static\\input.csv");
        Person resultPerson = new Person();
        resultPerson = people.stream().filter(person -> person.getName().equals(name)).findFirst().get();
        OutputingFunc outputingFunc = new OutputingFunc();
        System.out.println(resultPerson.getName() + " min = " + outputingFunc.MinReturn(resultPerson.getWallet().stream().min(Float::compare).get()) +
                " max = " + outputingFunc.MaxReturn(resultPerson.getWallet().stream().max(Float::compare).get()));
    }


}
