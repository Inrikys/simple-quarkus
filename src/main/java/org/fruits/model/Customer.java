package org.fruits.model;

public class Customer {

    Long id;
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
