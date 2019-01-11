package pl.sda.solutions;

public class CollectionUtilsSolutions {

    /**
     * Zamieniamy elementy tablica[i] i tablica[j]
     *
     * @param tablica - tablica elementów , na rzecz które robimy zamianę elementów na pozycji i i j
     * @param i       - indeks w tablicy
     * @param j       - indeks w tablicy
     *
     */
    public static void swap(int tablica[], int i, int j) {
        int hold = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = hold;
    }

    /**
     * Zwracamy położenie najmniejszego elementu z tablica[lo..hi]
     *
     *
     * @param tabślica
     * @param lo      - pozycja
     * @return
     */
    public static int getIndexOfNextMinElement(int tablica[], int lo) {
        int smallestPosition = lo;

        for( int i = lo + 1; i < tablica.length; i++){

            if(tablica[i] < tablica[smallestPosition]) smallestPosition = i;

        }
        return smallestPosition;
    }
}
