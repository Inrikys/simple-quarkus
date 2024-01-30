package org.fruits.model;

import java.util.UUID;

public class Fruit {

    private String name;
    private String description;
    private String id;

    public Fruit() {
    }

    public Fruit(String name, String description, String id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

}
