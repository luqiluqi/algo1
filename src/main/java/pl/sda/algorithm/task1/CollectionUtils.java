package pl.sda.algorithm.task1;

public class CollectionUtils {


    /**
     * Metoda zwraca maksymalną liczbę w tablicy
     * <p>
     * Pseudokod:
     * <p>
     * findMaxElement(int[] tab)
     *  max = tab[0]
     *      for 1 to n
     *          if (tab[i] > max)
     *              max = tab[i]
     * <p>
     * return max
     *
     */
    public static int findMaxElement(int[] tablica) {
        //TODO Metoda zwraca maksymalny element w kolekcji
        throw new RuntimeException("TODO");
    }

    /**
     * Metoda zwraca sume wszystkich elementów w tablicy
     *
     * Pseudokod:
     *
     * sumAllElements(int[] tab)
     *  sum = 0
     *  for 0 to n
     *          sum = sum + tab[i]
     * <p>
     * return sum
     *
     */
    public static int sumAllElements(int[] tablica) {
        //TODO
        throw new RuntimeException("TODO");
    }

    /**
     * Zamieniamy elementy tablica[i] i tablica[j]
     *
     * @param tablica - tablica elementów , na rzecz które robimy zamianę elementów na pozycji i i j
     * @param i       - indeks w tablicy
     * @param j       - indeks w tablicy
     */
    public static void swap(int tablica[], int i, int j) {
        throw new RuntimeException("TODO");
    }

    /**
     * Zwracamy INDEKS najmniejszego elementu z tablica[lo..hi]
     *
     * UWAGA - nie wartość tablicy - tylko indeks
     *
     * @param startFrom - pozycja startowa do iteracji
     *
     * Pseudokod:
     *
     * int getIndexOfNextMinElement  (int[] tab, int startFrom)
     *
     *  currentMinPosition = startFrom
     *  n = tablica.length
     *
     *   for i = startFrom; i < n; i++)
     *           if( tablica[i] < tablica[currentMinPosition]
     *                  currentMinPosition = i
     *
     *   return currentMinPosition
     *
     */
    public static int getIndexOfNextMinElement(int tablica[], int startFrom) {
        //TODO
       throw new RuntimeException("TODO");
    }


}
