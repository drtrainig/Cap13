package com.itfactory.live;


public class Employee {

    private String name;
    private double salary;
    private Departament departament;

    public Employee(String name, double salary, Departament departament) {
        this.name = name;
        this.salary = salary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Departament getDepartament() {
        return departament;
    }
}
