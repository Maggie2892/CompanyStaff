package com.sdajava.companystaff.model;

/**
 * Created by RENT on 2017-02-20.
 */
public class Human {
    public String name;
    public String surname;
    public int age;
    public String city;
    public String eyeColor;

    public Human (){

}
    // Alt+Insert --> Construkctor
    public Human (String name, String surname, int age, String city, String eyeColor){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
