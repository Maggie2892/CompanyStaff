package com.sdajava.companystaff.model;

import com.sdajava.companystaff.model.Human;

/**
 * Created by RENT on 2017-02-20.
 */
public class Worker extends Human {
    public String profession;
    public String department;
    public float salary;

    public Worker() {
    }

    public Worker(String name, String surname, int age, String city, String eyeColor,
                  String profession, String department, float salary) {
        super(name, surname, age, city, eyeColor); // konstruktor klasy human
        this.profession = profession;
        this.department = department;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return
                 name + ' ' +
                 surname + ' ' +
                 age + ' ' +
                 city + ' ' +
                 eyeColor + ' ' +
                 profession + ' ' +
                 department + ' ' +
                 salary ;
    }
}
