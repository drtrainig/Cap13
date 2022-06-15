package com.itfactory.live;

public enum Departament {

    HR(1231, "Human resources", "This department holds HR"),
    TESTING(12355, "Manual Testing", "It's about testing"),
    JAVA(11, "JAVA", "Java development");

    private final int id;
    private final String longName;
    private final String description;

    Departament(int id, String longName, String description) {
        this.id = id;
        this.longName = longName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getLongName() {
        return longName;
    }

    public String getDescription() {
        return description;
    }
}
