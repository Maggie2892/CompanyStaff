package com.sdajava.companystaff.model;

/**
 * Created by RENT on 2017-02-20.
 */
public class Boss extends Human {
    public int daysoff;
    public String lastConference;
    public boolean workCar;

    public Boss (){
    }


    public Boss(String name, String surname, int age, String city, String eyeColor, int daysoff, String lastConference,
                boolean workCar) {
        super(name, surname, age, city, eyeColor);
        this.daysoff = daysoff;
        this.lastConference = lastConference;
        this.workCar = workCar;
    }




}
