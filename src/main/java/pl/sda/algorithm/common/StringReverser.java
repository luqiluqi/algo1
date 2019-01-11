package pl.sda.algorithm.common;


/**
 *
 * TODO
 *
 * Zaimplementuj dwie metody
 *
 *  reverse1(String text) - zwraca test w odwrotnej kolejności z użyciem klasy StringBuilder.java
 *  reverse2(String text)- podobnie jak wyżej , tylko używając tablic
 *
 */
public class StringReverser {


    //TODO - użyj klasy StringBuilder
    public String reverse1(String text) {
        return null;
    }


    /*
     * Pseudkod:
     *  - Zamień zmienną text na tablicę znaków , czyli text.toCharArray()
     *  - Użyj dodatkowych zmiennych left i right - indeksów w tablicy znaków(left=0, right= array.length-1)
     *  - Iteruj jednoczesnie w pętli for przesuwając i zamieniając miejscami znaków w tablicy
     *  - pętla for może mieć postać : for (left = 0; left < right; left++, right--)
     */
    public String reverse2(String text) {
        return text;
    }


}
