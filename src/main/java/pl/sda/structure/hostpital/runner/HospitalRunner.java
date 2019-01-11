package pl.sda.structure.hostpital.runner;

import pl.sda.structure.hostpital.HospitalQueueService;
import pl.sda.structure.hostpital.PatientGenerator;
import pl.sda.structure.hostpital.model.Disease;
import pl.sda.structure.hostpital.model.Patient;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HospitalRunner {

    private static final String QUIT = "q";
    private static final String NEXT = "1";
    private static final String WHO_IS_NEXT = "2";
    private static final String NEW_PATIENT = "3";
    private static final String DEMO = "demo";


    private HospitalQueueService hospitalQueueService = new HospitalQueueService();

    public void run() throws InterruptedException {
        final Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        boolean demo = false;

        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append("Menu:\n")
                .append("1.Nastepny\n")
                .append("2.Kto jest nastepny?\n")
                .append("3.Dodaj pacjenta\n")
                .append("q - wyjdz\n")
                .append("demo tryb demo");

        while (!exit) {

            //Wyświetl menu
            System.out.println(menuBuilder.toString());
            //Pobierz od użytkownika z linii poleceń zadanie do wykonania
            final String userInput = scanner.nextLine();

            switch (userInput) {

                case QUIT:
                    //TODO uzupełnij ustaw odpowiednia flagę
                    break;
                case NEXT:
                    //TODO pobierz i usuń z listy pacjentów oczekujących
                    break;
                case WHO_IS_NEXT:
                    //TODO sprawdz kto następny
                    break;
                case NEW_PATIENT:
                    System.out.println("Imie");
                    final String name = scanner.nextLine();
                    System.out.println("Nazwisko");
                    final String surname = scanner.nextLine();
                    System.out.println("Jak jest z nim zle?");
                    final int howBad = Integer.valueOf(scanner.nextLine());
                    System.out.println("Zdiagnozowano na ...?");
                    final Disease diagnosed = Disease.valueOf(scanner.nextLine());


                    break;
                case DEMO:
                    System.out.println("Rozpoczynam demo!");
                    //TODO tutaj należy ustawić dwie zmienne typu boolean
                    break;
                default:
                    System.out.println("Nie rozpoznano");
            }
        }

        runDemo(demo);
        System.out.println("Koniec pracy");
    }

    private void runDemo(boolean demo) throws InterruptedException {
        if (demo) {
            final PatientGenerator patientGenerator = new PatientGenerator();

            //wypelniam 10 osobami
            for(int i = 0 ; i < 10; i++){
                hospitalQueueService.add(patientGenerator.get());
            }

            while (!hospitalQueueService.isEmpty()) {
                //Tworzymy symulacje - w tym celu usypiamy główny wątek program na 2 sekundy
                Thread.sleep(2000);
                hospitalQueueService.add(patientGenerator.get());
                Thread.sleep(new Random().nextInt(1000));
                final Patient next = hospitalQueueService.next();
                System.out.println("Nastepny!:");
                prettyPrintPatient(next);
            }
        }
    }


    private void prettyPrintPatient(Patient patient) {
        System.out.println(patient);
    }


}
