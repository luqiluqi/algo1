package pl.sda.structure.player.tutorial;

import java.util.Optional;

public class OptionalTutorial {


    public static void main(String args[]){
        //Klasa java.util.Optional została wprowadzona w javie 1.8
        // W celu eliminacji problemu NullPointerException

        //Tworzy tzw. wrapper klasy(po polsku można to przetłumaczyć na "opakowanie" :) dla dowolnych obiektów
        //Tworzymy pusty wraper klasy Integer
        Optional<Integer> wrappedInteger = Optional.empty();

        //Zwraca false
        wrappedInteger.isPresent();

        //rzuci wyjątkiem
        wrappedInteger.get();

        //Tworzymy instancję optionala klasy NaszaKlasa
        NaszaKlasa naszaKlasa = new NaszaKlasa();
        Optional<NaszaKlasa> opakowanieNaszejKlasy = Optional.of(naszaKlasa);

        //Zwraca true
        opakowanieNaszejKlasy.isPresent();

        //Pobierz opakowaną instancję
        NaszaKlasa naszaKlasa1 = opakowanieNaszejKlasy.get();


        //Dodatkowo możemy jeszcze użyć metody ofNullable, żeby przekazywać null i utworzyć obiekt Optional
        Optional<Object> o = Optional.ofNullable(null);

        //Zwróci false
        o.isPresent();

        assert  naszaKlasa == naszaKlasa1;
    }


    private static class NaszaKlasa{

    }

}
