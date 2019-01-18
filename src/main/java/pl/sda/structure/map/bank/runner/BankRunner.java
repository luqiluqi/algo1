package pl.sda.structure.map.bank.runner;

import pl.sda.structure.map.bank.BankService;
import pl.sda.structure.map.bank.UserService;

import java.util.Scanner;

public class BankRunner {


    public void run(){

        boolean run =true;

        //Menu
        String menuBulider = new StringBuilder("Menu: \n")
                .append("q wyjście\n")
                .append("1. Utwórz konto\n")
                .append("2. Wyswietl wszystkich użytkowników\n")
                .append("3. Utwórz konto dla użytkownika\n")
                .append("4. Pobierz typy wszystkie konto użytkownika\n")
                .append("5. Pobierz karty użytkownika\n")
                .toString();

        //Do pobierania poleceń od usera
        Scanner scanner = new Scanner(System.in);

        UserService userService = new UserService();
        BankService bankService = new BankService(userService);

        while (run){

            System.out.println(menuBulider);

            String command = scanner.nextLine();

            switch (command){
                case "q":
                    //TODO
                    break;
                case "1":
                    //TODO
                    break;
                case "2":
                    //TODO
                    break;
                case "3":
                    //TODO
                    break;
                case "4":
                    //TODO
                    break;
                case "5":
                    //TODO
                    break;
            }


        }


    }

}
