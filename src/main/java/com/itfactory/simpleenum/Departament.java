package com.itfactory.simpleenum;

public enum Departament {
    HR,
    TESTING,
    PM,
    JAVA;



    public static Departament findByValue(String value) {
        for (Departament d : values()) {
            if (value.equals(d.toString())) {
                return d;
            }
        }
        return null;
    }
}
