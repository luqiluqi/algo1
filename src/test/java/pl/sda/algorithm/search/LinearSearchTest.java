package pl.sda.algorithm.search;

import org.junit.Test;
import pl.sda.algorithm.search.LinearSearch;

import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void linearSearch1() {
        LinearSearch search = new LinearSearch();

        int actual = search.linearSearch(1, new int[]{1,2,3});

        assertEquals(0,actual);
    }

    @Test
    public void linearSearch2() {
        LinearSearch search = new LinearSearch();

        int actual = search.linearSearch(1, new int[]{55,78,87,99});

        assertEquals(-1,actual);
    }

    @Test
    public void linearSearch3() {
        LinearSearch search = new LinearSearch();

        int actual = search.linearSearch(78, new int[]{55,78,87,99});

        assertEquals(1,actual);
    }

}