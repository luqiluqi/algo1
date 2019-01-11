package pl.sda.solutions;

public class MyLinkedDoubleListSolution<T> {

    private Node<T> head;
    private Node<T> last;


    //TODO
    public Node<T> getFirst() {
        return head;
    }

    //TODO
    public Node<T> getLast() {
        return last;
    }

    //TODO
    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        int size = 0;

        Node<T> temp = head;

        while (temp != null) {
            ++size;
            temp = temp.next;
        }

        return size;
    }

    //TODO
    public boolean addFirst(T data) {
        //Dodajemy pierszy element
        if (checkIfFirstElement(data)) return true;

        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        newNode.prev = null;

        head.prev = newNode;

        head = newNode;
        return true;
    }

    //TODO
    public boolean addLast(T data) {
        if (checkIfFirstElement(data)) return true;


        Node<T> newNode = new Node<>(data);

        newNode.prev = last;
        newNode.next = null;

        last.next = newNode;
        last = newNode;


        return true;
    }

    //TODO
    public boolean add(int index, T data) {
        if (checkIfFirstElement(data)) return true;


        Node<T> prevNode = getNode(index - 1);
        Node<T> nexNode = prevNode.next;

        /* 2. allocate node
         * 3. put in the data */
        Node<T> newNode = new Node<>(data);

        newNode.next = nexNode;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (nexNode != null) nexNode.prev = newNode;

        //Ustawiamy ostatni element
        Node<T> holder = head;

        while (holder.next != null) {
            holder = holder.next;
        }
        last = holder;

        return true;
    }

    //TODO
    public boolean add(T data) {
        return add(size(), data);
    }


    public Node<T> getNode(int index) {
        int counter = index;
        Node<T> temp = head;

        while (counter > 0) {
            temp = temp.next;
            counter--;
        }

        return temp;
    }

    private boolean checkIfFirstElement(T data) {
        if (head == null) {
            Node<T> newNode = new Node<>(data);
            head = newNode;
            last = newNode;
            return true;
        }
        return false;
    }

    /**
     * Pobierz i usuń pierwszy element tej listy.
     */
    public T poll() {
        if (head == null) {
            throw new RuntimeException("Pusta lista");
        }
        Node<T> holder = head;
        Node<T> next = head.next;
        next.prev = null;
        head = next;
        return holder.getData();
    }


    public static class Node<T> {

        private Node<T> prev;
        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }


}
