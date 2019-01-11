package pl.sda.structure.stack;

import java.util.EmptyStackException;

/**
 * Stos to struktura LIFO(LAST IN , FIRST OUT)
 * <p>
 */
public class MyStack<T> {

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
        //TODO zaimplementuj metod , wzrorując się na
    }

    /**
     * Metoda pobiera ze stosu i usuwa
     * @return
     */
    public T pop() {
        //TODO
        return null;
    }

    public void printStack(){
        //TODO wypisz wszystkie elemnety stosu (Node.data)
    }

    public int size() {
        return size;
    }

}
