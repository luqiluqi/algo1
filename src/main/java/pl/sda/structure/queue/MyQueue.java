package pl.sda.structure.queue;

/**
 * Kolejka to struktura FIFO(FIRST IN , FIRST OUT)
 * <p>
 */
public class MyQueue {

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }


    public void add(int data) {
    }

    public int remove() {
        return -1;
    }


}
