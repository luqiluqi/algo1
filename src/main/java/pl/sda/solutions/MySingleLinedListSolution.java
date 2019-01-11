package pl.sda.solutions;


public class MySingleLinedListSolution {

    private Node head;

    /**
     * Sprawdzenie czy lista jest pusta
     */
    public boolean isEmpty() {
        //TODO - Podpowiedz : skoro zawsze wiemy że head będzie ustawiony za pierwszym razem :)
        return head == null;
    }

    /**
     * Sprawdzenie rozmiaru listy
     */
    public int size() {
        //TODO - chyba już gdzieś to mówiliśmy :)
        int count = 0;
        Node holder = head;
        while (holder != null) {
            ++count;
            holder = holder.next;
        }
        return count;
    }

    /**
     * Dodaj element na podanym indeksie
     */
    public boolean add(int index, Object element) {
        Node newNode = new Node(element);

        //Pierwszy element
        if (head == null && index == 0) {
            head = newNode;
            return true;
        }
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return true;
        }


        int size = size();
        Node prev = get(index - 1);
        Node next = get(index);
        prev.next = newNode;
        if( index < size){
            newNode.next = next;
        }
        return true;
    }

    /**
     * Pobranie i-tego elementu
     * <p>
     * Zastanów się - zapisujesz kopie "head" a następnie w pętli for iterujesz ,
     * przesuwając kopia = kopia.next
     */
    public Node get(int index) {
        Node holder = head;

        for (int i = 0; i < index; i++) {
            holder = holder.next;
        }

        return holder;
    }


    public static class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

    }


}
