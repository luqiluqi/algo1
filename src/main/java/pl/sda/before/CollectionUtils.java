package pl.sda.before;

public class CollectionUtils {


    /**
     * Metoda zwraca maksymalną liczbę w tablicy
     * <p>
     * Pseudokod:
     * <p>
     * findMaxElement(int[] tab)
     * max = tab[0]
     * for 1 to n
     * if (tab[i] > max)
     * max = tab[i]
     * <p>
     * return max
     */
    public static int findMaxElement(int[] tablica) {
        int max = tablica[0];

        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }

        return max;
    }

    /**
     * Metoda zwraca sume wszystkich elementów w tablicy
     * <p>
     * Pseudokod:
     * <p>
     * sumAllElements(int[] tab)
     * sum = 0
     * for 0 to n
     * sum = sum + tab[i]
     * <p>
     * return sum
     */
    public static int sumAllElements(int[] tablica) {
        int sum = 0;

        for (int i = 0; i < tablica.length; i++) {
            sum = sum + tablica[i];
        }

        return sum;
    }

    /**
     * Zamieniamy elementy tablica[i] i tablica[j]
     *
     * @param tablica - tablica elementów , na rzecz które robimy zamianę elementów na pozycji i i j
     * @param i       - indeks w tablicy
     * @param j       - indeks w tablicy
     */
    public static void swap(int tablica[], int i, int j) {
        int holder = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = holder;
    }

    /**
     * Zwracamy INDEKS najmniejszego elementu z tablica[lo..hi]
     * <p>
     * UWAGA - nie wartość tablicy - tylko indeks
     *
     * @param startFrom - pozycja startowa do iteracji
     *                  <p>
     *                  Pseudokod:
     *                  <p>
     *                  int getIndexOfNextMinElement  (int[] tab, int startFrom)
     *                  <p>
     *                  currentMinPosition = startFrom
     *                  n = tablica.length
     *                  <p>
     *                  for i = startFrom; i < n; i++)
     *                  if( tablica[i] < tablica[currentMinPosition]
     *                  currentMinPosition = i
     *                  <p>
     *                  return currentMinPosition
     */
    public static int getIndexOfNextMinElement(int tablica[], int startFrom) {
        int minPosition = startFrom;

        for (int i = startFrom; i < tablica.length; i++) {
            if (tablica[i] < tablica[minPosition]) {
                minPosition = i;
            }
        }
        return minPosition;
    }


}
