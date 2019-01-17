package pl.sda.structure.map.runner;

import java.math.BigDecimal;
import java.util.Random;

public class IbanGenerator {

    /**
     * Wbudowana klasa Random - generator liczb pseudolosowych w Javie
     *
     * https://javastart.pl/baza-wiedzy/darmowy-kurs-java/klasy/klasa-random-generator-pseudolosowy
     *
     */
    private static Random random = new Random();

    public static BigDecimal getRandomIban(){
        return  BigDecimal.valueOf(random.nextInt(16));
    }

}
