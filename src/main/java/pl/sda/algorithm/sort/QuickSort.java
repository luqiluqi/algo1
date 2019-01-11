package pl.sda.algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    public int[] sort(int[] array) {
        // Dobierz zmienną pivot


        // pivot z ang. "oś"
        // Iteruj po tablicy i sprawdzaj czy wszystkie elementy na lewo od "pivot" są mniejsze
        // i elementy na prawo od "pivot" są większe
        // Powtarzamy ten proces dla nowy tablic, na lewej i prawej od indeksu "pivot"
        quickSort(array, 0, array.length - 1);

        return array;
    }

    private void quickSort(int[] array, int left, int right) {
        // Warunek zatrzymania rekurencji
        if (left >= right) {
            return;
        }

        // Krok 1: Dobierz punkt pivot - w naszym przpadku to środkowy element
        int pivot = array[(left + right)/2];

        // Krok 2: Podziel tablice dla punktu pivot - i zwróc indeks w obrębie które
        // dokonujemy podziału na 2 podtablice
        int index = partition(array, left, right, pivot);

        // Step 3: Sortuj lewą i prawą stronę
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    private int partition(int[] array, int left, int right, int pivot) {
        // Przesuwaj lewy i prawy indeks do siebie
        while (left <= right) {

            // Przesuwaj lewy indeks do momentu aż znajdziesz element większy od "pivot"
            while(array[left] < pivot) {
                left++;
            }

            // Przesuwaj prawy indeks aż znajdziesz element mniejszy od pivotu
            while (array[right] > pivot) {
                right--;
            }

            // Dodakowe sprawdzenie , czy nie przesuneliśmy za daleko lewego lub prawego punktu
            if (left <= right) {
                //zamien elementy
                swap(array, left, right);
                left++;
                right--;
            }
        }
        //W tym momencie wszystkie elementy na lewo są mniejsze , a na prawo większe od "pivot"
        // Teraz musimy zwrócić następny punkt podziału
        return left;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
