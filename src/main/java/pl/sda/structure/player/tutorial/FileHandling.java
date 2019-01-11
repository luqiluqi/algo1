package pl.sda.structure.player.tutorial;

import java.io.InputStream;
import java.util.Scanner;

public class FileHandling {


    public static void main(String args[]) {
        ReadFile readFile = new ReadFile();
        readFile.read();
    }

    private static class ReadFile {

        public void read() {
            InputStream is = getClass().getResourceAsStream("/playlist1.txt");
            Scanner input = new Scanner(is);

            // Pobierz scannerowi, żeby odzielał kolumny znakiem "-"
            input.useDelimiter("-|\n");

            while (input.hasNext()) {
                String title = input.next();
                String duration = input.next();
                String artist = input.next();

                System.out.println(String.format("Title: %s , duration: %s , artist: %s",
                        title, duration, artist));

            }

        }
    }

}
