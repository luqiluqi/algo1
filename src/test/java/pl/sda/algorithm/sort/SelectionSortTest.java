package pl.sda.algorithm.sort;

import org.junit.Test;
import pl.sda.algorithm.sort.SelectionSort;

import static org.junit.Assert.*;

public class SelectionSortTest {

    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void testSort1() {
        //given
        int przed_sortowaniem[] = {4, 3, 2, 1};

        //when
        int[] po_sortowaniu = selectionSort.sort(przed_sortowaniem);

        //then
        assertArrayEquals(new int[]{1, 2, 3, 4}, po_sortowaniu);
    }

    @Test
    public void testSort2() {
        //given
        int przed_sortowaniem[] = {51,81,3};

        //when
        int[] po_sortowaniu = selectionSort.sort(przed_sortowaniem);

        //then
        assertArrayEquals(new int[]{3,51,81}, po_sortowaniu);
    }


    @Test
    public void testSort3() {
        //given
        int przed_sortowaniem[] = {11,47,5,81,91,27};

        //when
        int[] po_sortowaniu = selectionSort.sort(przed_sortowaniem);

        //then
        assertArrayEquals(new int[]{5,11,27,47,81,91}, po_sortowaniu);
    }

    @Test
    public void testSort4() {
        //given
        int przed_sortowaniem[] = {1,2,3,4};

        //when
        int[] po_sortowaniu = selectionSort.sort(przed_sortowaniem);

        //then
        assertArrayEquals(new int[]{1,2,3,4}, po_sortowaniu);
    }

}