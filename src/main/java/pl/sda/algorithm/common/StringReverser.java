package pl.sda.algorithm.common;


import javafx.scene.control.Tab;

import java.util.ArrayList;

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
        char [] tab = text.toCharArray();
        int j = tab.length - 1;
        char przechowalnia;
        for (int i = 0; i < j; i++){
            przechowalnia = tab[i];
            tab [i] = tab [j];
            tab [j] = przechowalnia;
            j--;
        }
        String revers = tab.toString();
        return revers;
    }



    /*
     * Pseudkod:
     *  - Zamień zmienną text na tablicę znaków , czyli text.toCharArray()
     *  - Użyj dodatkowych zmiennych left i right - indeksów w tablicy znaków(left=0, right= array.length-1)
     *  - Iteruj jednoczesnie w pętli for przesuwając i zamieniając miejscami znaków w tablicy
     *  - pętla for może mieć postać : for (left = 0; left < right; left++, right--)
     */
    public String reverse2(String text) {

        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        for(left = 0; left < right; left++){
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            right--;
        }
        return String.valueOf(chars);
    }


}
