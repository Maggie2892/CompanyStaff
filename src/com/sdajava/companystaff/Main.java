package com.sdajava.companystaff;

import com.sdajava.companystaff.controller.Controller;

import java.io.IOException;
import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        // 21.02.2017
        // String jest typem obiektowy, int char to typy proste
        // md5();   sha1();    do szyfrowania znaków
        // OAuth 2.0
        // rainbow tables - to łamania haseł wifi dla sieci WPA2

        String login = "maggie";
        String password = "1234";
        String userLogin;
        String userPassword;

        boolean optionFlag = true;
        boolean flag = true;
        int option = 0;

        Scanner in = new Scanner(System.in);

       // jest warunek w while jest prawdziwy to pętla będzie iterowała cały czas
        while (flag) {

            System.out.println("Podaj login: ");
            userLogin = in.nextLine();

            System.out.println("Podaj hasło: ");
            userPassword = in.nextLine();

            if (!(userLogin.equals(login) && userPassword.equals(password))) {
                System.out.println("Podałeś złe dane. ");
            } else {
                flag = false;              // zatrzymujemy pętlę po poprawnym wpisaniu danych
            }
        }

            // menu
        Controller controller = new Controller(); //obiekt klasy Controller


        while (optionFlag) {
           /* System.out.println("Witaj w naszym systemie!\n" +
                    "1. Dodaj nowego pracowanika\n" +
                    "2. Dodaj nowego szefa\n" +
                    "3. Pokaż wszystkich pracowników \n" +
                    "4. Pokaż wszystkich szefów\n" +
                    "0. Wyjście z programu"
            );
*/
            GUI.showMenu();
            System.out.println(GUI.companyName);

            System.out.println('\n');



            try{ option = in.nextInt();
            } catch(InputMismatchException ex){
                System.out.println("Incorrect input.");
                LOGGER.addHandler(new FileHandler("loger.xml"));
                LOGGER.info("Logger name: " + LOGGER.getName());
            }

            switch (option) {
                case 1: //dodawanie pracownika
                    controller.addWorker();
                    break;
                case 2: //dodawanie szefa
                    controller.addBoss();
                    break;
                case 3: //pokaż wszystkich pracowaników
                    controller.showWorkers();
                    break;
                case 4: //polaż wszystkich szefów
                    controller.showBosses();
                default: optionFlag = false;
            }
        }







      /* 21.02.2017
       if(userLogin.equals(login)){
            System.out.println("Podałeś dobry login.");
        } else {
            System.out.println("Podałeś zły login");
        }


        if( userPassword.equals(password)){
            System.out.println("Podałeś dobre hasło");
        } else {
            System.out.println("Podałeś złe hasło");
        }*/


   /*     if (userLogin.equals(login) && userPassword.equals(password) ) {
            System.out.println("Podałeś dobre dane");
            }
        else{
            System.out.println("Podałeś złe dane.");
            }
        */

 /*  20.02.2017
      List<Worker> workers = new ArrayList<Worker>();

     Worker worker1 = new Worker();

        worker1.name = "Katarzyna";
        worker1.surname = "Nowak";
        worker1.age = 34;
        worker1.city = "Wrocław";
        worker1.department = "IT";
        worker1.profession = "Junior developer";
        worker1.salary = 3000;
        worker1.eyeColor = "blue";


        Worker worker2 = new Worker();
        worker2.name = "Adam";
        worker2.surname = "Nowakowski";
        worker2.age = 36;
        worker2.city = "Poznań";
        worker2.department = "Trade market";
        worker2.profession = "Trade manager";
        worker2.salary = 5000;
        worker2.eyeColor = "green";
        System.out.println(worker2);

        Worker worker3 = new Worker("Anna", "Kowalska", 25, "Gdańsk", "grey", "Teacher", "Math", 3500);
        System.out.println(worker3);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        System.out.println("\nRozmiar listy: " + workers.size());
     for (Worker w:workers) {
      System.out.println("Imię pracowanika: "+ w.name);
     }

*/

     }

}
