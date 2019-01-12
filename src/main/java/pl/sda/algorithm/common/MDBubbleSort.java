package pl.sda.algorithm.common;


import pl.sda.before.CollectionUtils;

public class MDBubbleSort {

    /**
     * @param array - tablica do posortowania
     * @return posortowana tablica
     */
    public int[] sort(int[] array) {

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    CollectionUtils.swap(array, j, j + 1);
                }

            }


        }


        return array;
    }

}
