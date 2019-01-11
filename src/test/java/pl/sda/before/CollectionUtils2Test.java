package pl.sda.before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(BlockJUnit4ClassRunner.class)
public class CollectionUtils2Test {

    @Test
    public void testFindMaxElement1(){
        int[] tablica = new int[]{52,123,21,67,77,34,98,381,91};

        int maxElement = CollectionUtils.findMaxElement(tablica);

        assertEquals(381, maxElement);
    }

    @Test
    public void testFindMaxElement2(){
        int[] tablica = new int[]{2,23,11,76,7,34,81,81,191};

        int maxElement = CollectionUtils.findMaxElement(tablica);

        assertEquals(191, maxElement);
    }

    @Test
    public void testSumArray1(){
        int[] tablica = new int[]{1,2,3,4,5,6,7,8,9,10};

        int maxElement = CollectionUtils.sumAllElements(tablica);

        assertEquals(55, maxElement);
    }

    @Test
    public void testSumArray2(){
        int[] tablica = new int[]{2,23,11,76,7,34,81,81,191};

        int maxElement = CollectionUtils.sumAllElements(tablica);

        assertEquals(506, maxElement);
    }


}
