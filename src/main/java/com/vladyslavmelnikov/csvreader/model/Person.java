package com.vladyslavmelnikov.csvreader.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;

    private LinkedList<Float> wallet;

}
