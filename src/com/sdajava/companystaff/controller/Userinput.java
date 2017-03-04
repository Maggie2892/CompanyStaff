package com.sdajava.companystaff.controller;

import com.sdajava.companystaff.model.Boss;
import com.sdajava.companystaff.model.Worker;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-21.
 */
public class Userinput {

    public Worker populateWorker () {

        Worker worker = new Worker(); // nowy obiekt klasy Worker
        Scanner in = new Scanner(System.in);

        // wypełniam obiekt
        System.out.println("Podaj imię pracownika: ");
        worker.name = in.nextLine();

        System.out.println("Podaj nazwisko pracownika: ");
        worker.surname = in.nextLine();

        System.out.println("Podaj wiek pracownika: ");
        worker.age = in.nextInt();
        in.nextLine();

        System.out.println("Podaj zawód pracowanika: ");
        worker.profession = in.nextLine();

        return worker; // zwracam obiekt

    }

    public Boss populateBoss () {

        Boss boss = new Boss(); // nowy obiekt klasy Worker
        Scanner in = new Scanner(System.in);

        // wypełniam obiekt   (najpierw wszytskie Stringi a potem int )
        System.out.println("Podaj imię szefa: ");
        boss.name = in.nextLine();

        System.out.println("Podaj nazwisko szefa: ");
        boss.surname = in.nextLine();

        System.out.println("Podaj miasto szefa: ");
        boss.city = in.nextLine();

        System.out.println("Podaj wiek szefa: ");
        boss.age = in.nextInt();


        return boss; // zwracam obiekt

    }




}

