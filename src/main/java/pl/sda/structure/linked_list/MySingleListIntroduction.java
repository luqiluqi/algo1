package pl.sda.structure.linked_list;


/**
 * Zanim rozpoczniesz implementacje list jedno/dwukierunkowych zapoznaj się z tutorialem
 * <p>
 * Lista jednkokierunkowa - przechowujemy tylko referencje do następnego element (next)
 * <p>
 * Lista dwukierunkowa - przechowujemy referencje do następnego element (next) i poprzedniego (prev)
 */
public class MySingleListIntroduction {


    /*
     *  Dla listy jednokierunkowej naszą intencją jest stworzenie wygodnej
     *  kolekcji która obsłuży metody:
     *
     *          -boolean isEmpty()
     *          -int size()
     *          -add(int index, Object element)
     *          -Node get(int index)
     *
     *          Opis metod powinien być intuicyjny - opis szczegółowy znajduje się w klasie MySingleLinedList
     *
     */
    public static void main(String[] args) {
        ListaJednokierunkowa<String> lista = new ListaJednokierunkowa<>();
        lista.head = new Node<>("1");
        lista.head.next = new Node<>("2");
        lista.head.next.next = new Node<>("3");
        lista.head.next.next.next = new Node<>("4");

        // Co to jest head ? - to referencją do pierwszego elementu tablicy
        // UWAGA! head powinien zostać tylko przypisany raz - podczas dodawania pierwszego elementu
        // Co to oznacza w praktyce ? - gdy chcemy np. iterować po liście jak w/w przypadku:

        // Zamiast na "orginalnym" obiekcie head - używamy kopii obiektu:
        Node<String> holder = lista.head;

        // Gdy chcemy iterować (czyli wersja pętli for dla list jednokierunkowych :)) :

        while (holder != null) {
            System.out.println(holder.data);
            holder = holder.next;
        }

        //Gdy chcemy zliczyć elementy(Sprawdz co się stanie gdy zamiast używać nowej kopii,
        // będziemy używać zmiennej nazwie holder) :
        Node<String> new_holder = holder;
        int count = 0;
        while (new_holder != null) {
            ++count;
            new_holder = new_holder.next;
        }
        System.out.println(String.format("Liczba elementów %d", count));

    }

    private static class ListaJednokierunkowa<T> {
        private Node<T> head;

    }

    private static class Node<T> {

        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
        }
    }


}
