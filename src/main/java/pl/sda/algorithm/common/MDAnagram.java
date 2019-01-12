package pl.sda.algorithm.common;

import java.util.Arrays;
import java.util.HashMap;

public class MDAnagram {

    /**
     *
     * Anagram jest słowem, które można powstać, zmieniając kolejność liter w innym słowie.
     *
     * Czyli np:
     *
     *  tar => rat to anagram bo z arc można zbudować stringa car i odwrotnie...
     *
     *  stan => smak nie jest anagramem
     *
     *  więcej przykładów anagramów znajdziesz w AnagramTest.java
     *
     * Podpowiedz
     *  -żeby pobrać tablice znaków ze stringa użyj text1.toCharArray()
     *  -pomocne może być sortowanie - Arrays.sort
     *
     */
    public boolean isAnagram(String text1, String text2) {

        if(text1.length() != text2.length()){
            return false;
        }

        char[] ch1 = text1.toCharArray();
        char[] ch2 = text2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i = 0 ; i < ch2.length;i++ ){
            if(ch1[i]!= ch2[i]){
                return false;
            }
        }
        return true;
    }

}
