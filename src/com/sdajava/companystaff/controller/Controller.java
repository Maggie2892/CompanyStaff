package com.sdajava.companystaff.controller;

import com.sdajava.companystaff.model.Boss;
import com.sdajava.companystaff.model.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

/**
 * Created by RENT on 2017-02-21.
 */

// klasa sterująca
    public class Controller {

    Userinput userinput = new Userinput();

    public List<Worker> workerList = new ArrayList<>();
    public List<Boss> bossList = new ArrayList<>();

    public void addWorker() {

        Worker w1 = userinput.populateWorker();
        workerList.add(w1);
    }

    public void addBoss(){
        System.out.println("Dodaje szefa");
        Boss b1 = userinput.populateBoss();
        bossList.add(b1);

    }

    public void showWorkers(){
         if (workerList.size()==1){
             System.out.println("W firmie mamy: " + workerList.size() + " pracownika.");
         } else{
             System.out.println("W firmie mamy: " + workerList.size() + " pracowników.");
         }

       /* 1 sposób na pętlę int
        for (int i; i <  workerList.size(); i++) {
            System.out.println(workerList.get(i).surname);
        }
        */
       workerList.stream().forEach(s -> System.out.println(s.name + " " + s.surname + " " +  s.age + " " + s.profession));
        /*for (Worker w:workerList){
         System.out.println(" Imię: " + w.name + " Nazwisko: " + w.surname + " Wiek: " + w.age + " Zawód: " + w.profession);
            }*/

         }

          public void showBosses() {
              if (bossList.size()==1){
                  System.out.println("W firmie mamy: " + bossList.size() + " szefa");
              }else {
                  System.out.println("W firmie mamy: " + bossList.size() + " szefów");
              }
             // bossList.stream().sorted();
              bossList.stream().forEach(s -> System.out.println(s.name));// + " " + s.surname + " " + s.city + " " + s.age));


        //    for (Worker w:workerList){
        //    System.out.println(" Imię: " + w.name + " Nazwisko: " + w.surname + " Wiek: " + w.age + " Zawód: " + w.profession);



// .sorteed(Comparator.reverseOrder)







    }

 }