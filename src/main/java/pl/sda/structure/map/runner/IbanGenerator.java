package pl.sda.structure.map.runner;

import java.math.BigDecimal;
import java.util.Random;

public class IbanGenerator {

    private static Random random = new Random();

    public static BigDecimal getRandomIban(){
        return  BigDecimal.valueOf(random.nextLong());
    }

}
