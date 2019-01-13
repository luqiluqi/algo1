package pl.sda.structure.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class MDMyQueueTest {

    @Test
    public void testAdd1(){

        MDMyQueue queue = new MDMyQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        assertEquals(4,queue.size());
    }



}