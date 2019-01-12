package pl.sda.algorithm.sort;

import pl.sda.before.CollectionUtils;

public class MDSelectionSort {

    /**
     * TODO Sortowanie przez wybieranie - uzupełnij poniższą metode
     * W celu weryfikacji poprawności uruchom test SelectionSortTest
     *
     *
     * Pseudokod:
     *
     * For i = 0 to n​
     *  min_pozycja= pozycja najmniejszej wartości z zakresu od tablica[i] do tablica[n-1]​
     *  Zamień tablica[i] z tablica[min_pozycja]
     */
    public int[] sort(int tablica[]) {

        for(int i =0 ; i < tablica.length -1 ;i++){
            int minPos = CollectionUtils.getIndexOfNextMinElement(tablica,i);
            CollectionUtils.swap(tablica,i,minPos);

        }


        return tablica;
    }

}
