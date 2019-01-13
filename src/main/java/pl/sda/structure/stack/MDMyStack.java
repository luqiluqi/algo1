package pl.sda.structure.stack;

/**
 * Stos to struktura LIFO(LAST IN , FIRST OUT)
 * <p>
 */
public class MDMyStack<T> {

    private class Node {
        private T data;
        private Node next;
        private Node (T data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    /**
     * Metoda odkłada na stos
     * @param data
     */
    public void push(T data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    /**
     * Metoda pobiera ze stosu i usuwa
     * @return
     */
    public T pop() {
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    public void printStack(){
        Node temp = head;

        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {
        return size;
    }

}
