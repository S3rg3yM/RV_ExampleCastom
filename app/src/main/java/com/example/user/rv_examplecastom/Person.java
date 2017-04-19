package com.example.user.rv_examplecastom;

import java.util.ArrayList;

/**
 * Created by user on 18.04.2017.
 */

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Person> PersonsList(int numContacts) {
        ArrayList<Person> persons = new ArrayList<Person>();

        for (int i = 1; i <= numContacts; i++) {
            persons.add(new Person("Person " + i));
        }

        return persons;
    }
}
