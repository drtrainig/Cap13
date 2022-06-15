package com.itfactory.complexenum;

public enum Departament {
    HR(123, "Human Resources"),
    TESTING(124, "Manual Testing"),
    JAVA(122, "Java Development");

    private final int departmentId;
    private final String longDescription;

    Departament(int departmentId, String longDescription) {
        this.departmentId = departmentId;
        this.longDescription = longDescription;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public static Departament findById(int departmentId) {
        for (Departament value : Departament.values()) {
            if (value.getDepartmentId() == departmentId) {
                return value;
            }
        }
        return null;
    }
}
