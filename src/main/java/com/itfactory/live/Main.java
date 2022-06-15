package com.itfactory.live;

public class Main {
    public static void main(String[] args) {
        Departament d = Departament.HR;

        System.out.println(d.getId());
        System.out.println(d.getLongName());
        System.out.println(d.getDescription());


        Departament d1 = Departament.HR;
        System.out.println(d1.getId());
        System.out.println(d1.getLongName());
        System.out.println(d1.getDescription());
    }
}
