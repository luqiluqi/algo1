package pl.sda.algorithm.sort;

import org.junit.Test;
import pl.sda.algorithm.sort.InsertionSort;

import static org.junit.Assert.*;

public class InsertionSortTest {

    private InsertionSort insertionSort = new InsertionSort();

    @Test
    public void testSort1() {
        //given
        int przed_sortowaniem[] = {4, 3, 2, 1};

        //when
        int[] po_sortowaniu = insertionSort.sort(przed_sortowaniem);

        //then
        assertArrayEquals(new int[]{1, 2, 3, 4}, po_sortowaniu);
    }

    @Test
    public void testSort2() {
        //given
        int przed_sortowaniem[] = {51, 81, 3};

        //when
        int[] po_sortowaniu = insertionSort.sort(przed_sortowaniem);

        //then
        assertArrayEquals(new int[]{3, 51, 81}, po_sortowaniu);
    }

    @Test
    public void testSort3() {
        //given
        int przed_sortowaniem[] = {6,5,3,1,8,7,2,4};

        //when
        int[] po_sortowaniu = insertionSort.sort(przed_sortowaniem);

        //then
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, po_sortowaniu);
    }

}