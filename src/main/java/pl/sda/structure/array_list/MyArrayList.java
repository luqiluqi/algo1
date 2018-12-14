package pl.sda.structure.array_list;


/**
 * TODO
 * <p>
 * <p>
 * Zaimplementuj listę dynamiczną przechowującą liczby całkowite int[] array
 */
public class MyArrayList {

    private int[] array = null;
    private int size = 0;


    public MyArrayList() {
        array = new int[2];
    }

    /**
     * TODO Pobierz i-ty element z tablicy
     */
    public int get(int index) {
        //TODO
        throw new RuntimeException("TODO");
    }

    /*
     *TODO na podanym parametrze index ustaw wartość element w tablicy array
     *
     * Podpowiedz - Lista to struktura dynamiczna , należy automatycznie roszerzyć listę w przypadku
     * gdy osiągnie maksimum (array.size < size)
     *
     * W javie można łatwo kopiować tablice
     * System.arraycopy(source, 0, target, 0, array.length);
     *
     */
    public boolean add(int element) {
        //TODO
        throw new RuntimeException("TODO");
    }

    /**
     * TODO usuń element o podanym indeksie
     */
    public int remove(int index) {
        //TODO
        throw new RuntimeException("TODO");
    }


}