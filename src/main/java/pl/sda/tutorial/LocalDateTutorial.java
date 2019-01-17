package pl.sda.tutorial;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.TemporalAmount;

/**
 * Tutorial zawiera tylko informacje potrzebne do wykonania ćwiczeń na zajęciach i zawiera
 * podstawowe operacje związane z DateTimeApi w Javie, więcej informacji znajdziecie w :
 * <p>
 * https://www.journaldev.com/2800/java-8-date-localdate-localdatetime-instant
 */
public class LocalDateTutorial {

    public static void main(String args[]) {
        //LocalDate czyli prostę operacja na datach
        //Utwórz obiekt LocalDate z aktualną data
        LocalDate now = LocalDate.now();

        //Dodaj 10 dni do aktualnej daty analogicznie występuję minusMonths minusWeeks itd
        LocalDate tenDaysLater = now.plusDays(10);

        // Odejmij 7 dni od dnia dzisiejszego analogicznie występuję minusMonths minusWeeks itd
        LocalDate sevenDayBefore = now.minusDays(12);

        //porównaj 2 daty (można jeszcze użyć metody isAfter
        boolean before = sevenDayBefore.isBefore(tenDaysLater);
        assert before == true;

        //Inny sposób na tworzenie daty
        //Utwórz date 21-12-1991
        LocalDate of1991 = LocalDate.of(1991, 12, 21);


        //tworze dwa obiekty typu Year - reprezentujące Rok
        final Year year2000 = Year.of(2000);
        final Year year1990 = Year.of(1990);
        System.out.println(year2000.isAfter(year1990)); // prawda, rok 2000 jest po roku 1990
        System.out.println(year2000.isBefore(year1990)); //falsz, rok 1990 jest przed rokiem 2000


    }


}
