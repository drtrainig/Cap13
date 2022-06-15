package com.itfactory.complexenum;

public class Main {

    public static void main(String[] args) {

        Departament d = Departament.HR;
        System.out.println(d.getDepartmentId());

        Departament d2 = Departament.JAVA;
        System.out.println(d2.getDepartmentId());

        Departament d3 = Departament.findById(123);
        if (d3 != null) {
            System.out.println(d3.getLongDescription());
        }
    }
}
