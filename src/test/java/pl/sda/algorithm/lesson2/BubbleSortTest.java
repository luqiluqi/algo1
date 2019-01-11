package pl.sda.algorithm.lesson2;

import org.junit.Test;
import pl.sda.algorithm.common.BubbleSort;

import static org.junit.Assert.*;

public class BubbleSortTest {


    @Test
    public void test1(){
        BubbleSort sort = new BubbleSort();
        int[] array = {5,3,15,1,19};

        int[] sorted = sort.sort(array);

        assertArrayEquals(new int[]{1,3,5,15,19},sorted);
    }

    @Test
    public void test2(){
        BubbleSort sort = new BubbleSort();
        int[] array = {18,9,3,4,12};

        int[] sorted = sort.sort(array);

        assertArrayEquals(new int[]{3,4,9,12,18},sorted);
    }


    @Test
    public void test3(){
        BubbleSort sort = new BubbleSort();
        int[] array = {55,83,19,69,9};

        int[] sorted = sort.sort(array);

        assertArrayEquals(new int[]{9,19,55,69,83},sorted);
    }

}