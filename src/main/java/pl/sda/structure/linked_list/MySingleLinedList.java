package pl.sda.structure.linked_list;


public class MySingleLinedList {

    private Node head;

    /**
     * Sprawdzenie czy lista jest pusta
     */
    public boolean isEmpty() {
        //TODO - Podpowiedz : skoro zawsze wiemy że head będzie ustawiony za pierwszym razem :)
        throw new RuntimeException("TODO");
    }

    /**
     * Sprawdzenie rozmiaru listy
     */
    public int size() {
        //TODO - chyba już gdzieś to mówiliśmy :)
        throw new RuntimeException("TODO");
    }

    /**
     * Dodaj element na podanym indeksie
     *
     */
    public boolean add(int index, Object element) {
        Node newNode = new Node(element);

        //Pierwszy element
        if (head == null && index == 0) {
            //TODO uzupełnij i zwróc return true;
            throw new RuntimeException("TODO");
        }

        //Pobierz element index -1 =>  Node byIndex = get(index - 1);
        // A następnie ustaw element byIndex.next = newNode i zwróć return true;
        throw new RuntimeException("TODO");
    }

    /**
     * Pobranie i-tego elementu
     *
     * Zastanów się - zapisujesz kopie "head" a następnie w pętli for iterujesz ,
     * przesuwając kopia = kopia.next
     *
     */
    public Node get(int index) {
        //TODO
        throw new RuntimeException("TODO");
    }


    private static class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }


}
