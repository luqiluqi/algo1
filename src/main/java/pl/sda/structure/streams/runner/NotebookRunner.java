package pl.sda.structure.streams.runner;

import pl.sda.structure.streams.enums.Brand;
import pl.sda.structure.streams.enums.Notebook;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

public class NotebookRunner {

    private final static Set<Notebook> notebooks = new HashSet<>();
    static {
        //to jest statyczny blok inicjalizacyjny, wykona sie tylko raz w calej aplikacji
        notebooks.add(new Notebook("Very old name", Brand.ACER, Year.of(1990), 5.0, false));
        notebooks.add(new Notebook("L702", Brand.DELL, Year.of(2007), 100.0, false));
        notebooks.add(new Notebook("XPS 15", Brand.DELL, Year.of(2018), 10000.0, true));
        notebooks.add(new Notebook("Galaxy Book 12", Brand.SAMSUNG, Year.of(2016), 3199.0, true));
        notebooks.add(new Notebook("MacBook Pro", Brand.APPLE, Year.of(2018), 12099.0, true));
        notebooks.add(new Notebook("MacBook", Brand.DELL, Year.of(2018), 5000, true));
        notebooks.add(new Notebook("MacBook Air", Brand.DELL, Year.of(2018), 6000, true));
    }
    public void run() {

        //podpowiedz: Set mozna przerobic na stream dokladnie tak samo jak list, czyli notebooks.stream()
        //podpowiedz: jesli niewygodnie uzywa Ci sie streamow to nic zlego, uzyj zwyczajnego fora i np. ifa w srodku - rezultat ten sam :)
        //podpowiedz: tak sie uzywa Year:
        //tworze dwa obiekty typu Year
        final Year year2000 = Year.of(2000);
        final Year year1990 = Year.of(1990);
        System.out.println(year2000.isAfter(year1990)); // prawda, rok 2000 jest po roku 1990
        System.out.println(year2000.isBefore(year1990)); //falsz, rok 1990 jest przed rokiem 2000
        //to byl tylko przyklad jak tego uzywac, mozesz usunac ten kod :)

        //Tutaj dodaj kod swojej aplikacji




    }

}
