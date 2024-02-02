package org.fruits.enums;

public enum RegionEnum {

    NORTH("Norte"),
    NORTHEAST("Nordeste"),
    CENTER_WEST("Centro-Oeste"),
    SOUTHEAST("Sudeste"),
    SOUTH("Sul");

    String name;

    RegionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
