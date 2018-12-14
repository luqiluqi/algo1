package pl.sda.algorithm.task1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import pl.sda.algorithm.solutions.CollectionUtilsSolutions;

import static org.junit.Assert.*;

/**
 * Zaimplementuj metodę CollectionUtils.swap, a następnie zweryfikuj poprawność testów:
 *  -testSwap1
 *  -testSwap2
 *  -testSwap3
 * <p>
 * <p>
 *
 *  Następnie zaimplementuj metodę CollectionUtils.getIndexOfNextMinElement
 *  -testGetSmallestPosition1
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class CollectionUtils1Test {

    @Test
    public void testSwap1() {
        //given
        int tablica[] = {4, 5, 8, 7};

        //when zamiana 4 i 5
        CollectionUtils.swap(tablica, 0, 1);

        //then
        assertArrayEquals(new int[]{5, 4, 8, 7}, tablica);
    }

    @Test
    public void testSwap2() {
        //given
        int tablica[] = {14, 51, 18, 71, 8, 53, 87};

        //when zamiana 51 i 8
        CollectionUtils.swap(tablica, 1, 4);

        //then
        assertArrayEquals(new int[]{14, 8, 18, 71, 51, 53, 87}, tablica);
    }

    @Test
    public void testSwap3() {
        //given
        int[] tablica = {7, 89, 13};

        //when zamiana 7 i 13
        CollectionUtils.swap(tablica, 0, 2);

        //then
        assertArrayEquals(new int[]{13, 89, 7}, tablica);
    }

    @Test
    public void testGetSmallestPosition1() {
        //given
        int[] tablica = {17, 64, 13, 48};

        //when
        int smallestPosition = CollectionUtilsSolutions.getIndexOfNextMinElement(tablica, 0);

        //then
        assertEquals(2, smallestPosition);
    }


}