package pl.sda.structure.queue;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyQueueTest {

    @Test
    public void enqueue() {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        assertEquals(3,queue.size());
    }

    @Test
    public void dequeue() {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        assertEquals(3,queue.size());

        String one = queue.dequeue();
        String two = queue.dequeue();
        assertEquals(1,queue.size());
        assertEquals("1",one);
        assertEquals("2",two);
    }

}
