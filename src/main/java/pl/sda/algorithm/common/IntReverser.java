package pl.sda.algorithm.common;

public class IntReverser {


    /**
     * Zanimy przystąpisz do rozwiązania zapoznaj się z operacją modulo - reszta z dzielnia (operator % w javie)
     *
     * np. 123 % 10 = 3 (12 * 10 = 120 , zostaję 3)
     *     17 % 4 = 1 (4 * 4 = 16 zostaje 1) itd..
     *
     * W przypadku tego algorytmu zeby zabrać ostatnią cyfrę dowolnej liczby(lastDigit) wystarczy
     * wykonywać operacje modul%10 czyli np:
     *
     *      1234 % 10 = 4
     *
     * Kiedy chcesz pozbyć się ostatniej cyfry wystarczy wykonać operację dzielnie liczba/10
     *  np. 211 /10 = 21
     *
     * Już wiemy jak pobrać ostatnią literę, oraz pozyć się z liczby ostatniej litery, pozostaje
     * zbudowanie liczby odwrotnej:
     *
     * reverse = reverse * 10 + lastDigit; < - czyli przesuń liczbę aktualną o jedno miejsce w prawo(mnożenie razy 10)
     * oraz dodaj nowy znak(lastDigit)
     *
     */
    public int reverse(int x) {
        boolean isNegative = x < 0;

        if(isNegative) {
            x = x * -1;
        }

        int reverse = 0;
        int lastDigit = 0;

        //Dopóki długość liczby x>=1
        while (x >= 1) {
            //TODO pobierz ostatni literę
            lastDigit = 0;

            // TODO Przesuń o jedno miejsce starą wartość i dodaj nowy znak (lastDigit)
            reverse = 0;

            //TODO - Pozbądz się ostatniej litery
            x = 0;
        }

        return isNegative ? reverse*-1 : reverse;
    }

}
