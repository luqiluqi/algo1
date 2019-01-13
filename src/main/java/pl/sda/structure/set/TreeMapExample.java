package pl.sda.structure.set;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

public class TreeMapExample {

    public static void main(String args[]){


        Set<Integer> zbior = new TreeSet<>();

        zbior.add(4);
        zbior.add(2);
        zbior.add(3);
        zbior.add(1);

        for(Integer i : zbior){
            System.out.println(i);
        }


        Set<Money> moneySet = new TreeSet<>();

        moneySet.add(null);
        moneySet.add(new Money(BigDecimal.ONE));
        moneySet.add(new Money(BigDecimal.TEN));

        for(Money i : moneySet){
            System.out.println(i);
        }


    }

}
