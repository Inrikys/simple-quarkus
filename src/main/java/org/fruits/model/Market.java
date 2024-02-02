package org.fruits.model;

public class Market {

    private Long id;

    private String name;

    private String description;

    private Address address;

    public Market(Long id, String name, String description, Address address) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Address getAddress() {
        return address;
    }
}
