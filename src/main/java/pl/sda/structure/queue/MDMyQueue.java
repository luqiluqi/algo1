package pl.sda.structure.queue;

/**
 * Kolejka to struktura FIFO(FIRST IN , FIRST OUT)
 * <p>
 */
public class MDMyQueue {

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;


    public void add(int data) {
        Node newNode = new Node(data);

        if(tail != null){
            tail.next = newNode;
        }

        tail = newNode;

        if(head == null){
            head = tail;
        }

        size++;
    }

    public int size(){
        return size;
    }

    public int remove() {
        int holder = head.data;

        head = head.next;

//        if(head == null){
//            tail = null;
//        }

        return holder;
    }


}
