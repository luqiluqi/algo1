package pl.sda.solutions;


public class MyArrayListSolution {

    private int[] array = null;
    private int size = 0;

    public MyArrayListSolution() {
        array = new int[2];
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public boolean add(int element) {
        if (size >= array.length) {
            // powiększ tablicę i skopiuj do niej elementy
            int[] new_table = new int[array.length * 2];
            System.arraycopy(array, 0, new_table, 0, array.length);
            array = new_table;
        }
        array[size] = element;
        size++;
        return true;
    }

    public int remove(int index) {
        int element = get(index);
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];

        }
        size--;
        return element;
    }


}