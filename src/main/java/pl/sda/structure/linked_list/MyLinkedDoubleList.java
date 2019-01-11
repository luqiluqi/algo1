package pl.sda.structure.linked_list;

public class MyLinkedDoubleList<T> {

    //Tym razem przechowujemy referencje do elementu pierwszego i poprzedniego
    // (head - pierwszy, last -ostatni)
    private Node<T> head;
    private Node<T> last;

    //Pobierz pierwszy element listy
    public Node<T> getFirst() {
        Node<T> copy = new Node<>(head.data);
        return copy;
    }

    //Pobierz ostatni element listy
    public Node<T> getLast() {
        Node<T> copy = new Node<>(last.data);
        return copy;
    }

    //Czy lista jest pusta ( nie zawiera elementów)
    public boolean isEmpty() {
        return head == null;
    }

    //Pobierz rozmiar listy
    public int size() {
        int count = 0;
        Node<T> holder = head;

        while (holder != null) {
            ++count;
            holder = holder.next;
        }
        return count;
    }

    //Dodaj na początku listy
    public boolean addFirst(T data) {
        //Dodajemy pierszy element
        if (checkIfFirstElement(data)) return true;


        Node<T> newNode = new Node<>(data);

        //Skoro na początku to na co ma wskazywać
        //          newNode.next?
        //          head.prev?
        //
        // Niezapomnij zaaktualizować pola head!
        //        i zwrócić return true;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return true;

    }

    //Dodaj na końcu listy
    public boolean addLast(T data) {
        if (checkIfFirstElement(data)) return true;
        Node<T> newNode = new Node<>(data);
        /**
         * Skoro na końcu to na co ma wskazywać:
         *          newNode.prev
         *          last.next
         *
         * Niezapomnij zaaktualizować pola last!
         * i zwrócić return true;
         */
        newNode.prev = last;
        last.next = newNode;
        last = newNode;

        return true;

    }

    /**
     * Chcemy dodać newNode pomiędzy:
     * |prevNode| <--> |nextNode|
     */
    public boolean add(int index, T data) {
        if (checkIfFirstElement(data)) return true;

        Node<T> prevNode = getNode(index - 1);
        Node<T> nexNode = prevNode.next;
        Node<T> newNode = new Node<>(data);

        /**
         * TODO czyli należy przepiąć referencje dla:
         *      -newNode.next = ?
         *      -prevNode.next = ?
         *      -newNode.prev = ?
         *      -nexNode.prev = ? (Uwaga! - może się zdarzyć że nexNode == null(np. tylko jeden element))
         */

        /**   Musimy zaaktulizować pole last w tym celu :
         *          -iterujemy od Node<T> holder = head; czyli while (holder.next != null){holder = holder.next}
         *          -i jako pole last ustawić należy holder (przesuneliśmy się na ostatni element)
         *
         *    i zwracamy true:)
         */
        throw new RuntimeException("TODO");
    }

    public Node<T> getNode(int index) {
        //TODO - podobnie jak dla MySingleLinedList#get(index)
        throw new RuntimeException("TODO");
    }

    public boolean add(T data) {
        return add(size(), data);
    }

    private boolean checkIfFirstElement(T data) {
        //Czy dodajemy pierwszy element
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
     * <p>
     * Tutaj trzeba będzie przepiąć "head" na element następny head = head.next (przyda się operowanie na kopii )
     */
    public T poll() {
        if (head == null) {
            throw new RuntimeException("Pusta lista");
        }
        //TODO
        throw new RuntimeException("TODO");
    }


    public static class Node<T> {

        Node<T> prev;
        Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

}
