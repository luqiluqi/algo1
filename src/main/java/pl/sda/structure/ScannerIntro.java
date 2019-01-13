package pl.sda.structure;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        boolean run = true;


        while (run) {
            try {
                String command = scanner.nextLine();


                switch (command) {

                    case "q":
                        run = false;
                        break;
                    case "1":
                        System.out.println("Wybrano opcja 2");
                        break;
                    case "2":
                        throw new RuntimeException("Wystąpił błąd");


                }
            } catch (Exception e) {

            }

        }


    }

}
