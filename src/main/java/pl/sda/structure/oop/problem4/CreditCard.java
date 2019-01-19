package pl.sda.structure.oop.problem4;


public class CreditCard {


    public CreditCard(String name, String[] prefixes, int[] lengths) {
    }

    /**
     *  Potrzbować będziesz metod:
     *          startsWith - do sprawdzenia prefixów
     *          contains - do sprawdzenia długości
     *
     * @param cardNumber
     * @return
     */
    public boolean matches(String cardNumber){

        int length = carcNumber.length();

        return carcNumber.startsWith(cardPrefix) && cardLength == length;
        //Krok1 sprawdz długość cardNumber.length czy zawiera się w długościach dla karty (contains)

        //Krok2 sprawdz prefix - startWith metda dla klasy String

        //Zwróc false jeśli w/w warunki nie przeszły
        return false;
    }



}
