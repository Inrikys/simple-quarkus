package org.fruits.model;

import org.fruits.enums.StateEnum;

public class Address {

    private String street;

    private Integer number;

    private String neighborhood;

    private String city;

    private StateEnum state;

    private String zipCode;

    public Address(String street, Integer number, String neighborhood, String city, StateEnum state, String zipCode) {
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public StateEnum getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}
