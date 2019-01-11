package pl.sda.before;

import java.util.*;

public class StackVsQueue {

    public static void main(String args[]){
        stosPrzyklady();
        kolejkaNaPrzykladznieLinkedList();
    }

    private static void stosPrzyklady(){
        System.out.println("---------STOS---------");

        Stack<String> operacjePaint = new Stack<>();


        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.pop();


        //Użytkownik wybiera przycisk Pędzel i rysuje
        operacjePaint.push("Pędzel");
        operacjePaint.push("Pędzel");
        operacjePaint.push("Pędzel");
        operacjePaint.push("Pędzel");


        //Użytkownik wybiera przycisk Pióro i rysuje
        operacjePaint.push("Pióro");
        operacjePaint.push("Pióro");
        operacjePaint.push("Pióro");


        wypiszWszystkieElementyKolejkcji(operacjePaint, "Operacje użytkownika: ");

        //Użytkownik kilka przycisk "Cofnij" i chce się pozbyć operacji piórem
        operacjePaint.pop();
        operacjePaint.pop();
        operacjePaint.pop();


        wypiszWszystkieElementyKolejkcji(operacjePaint,"Po wycofaniu pióra");
    }


    private static void kolejkaNaPrzykladznieLinkedList(){
        System.out.println("---------Kolejka na przykładznie linkedlist---------");

        //Tworzymy nową kolejkę
        Queue<String> pacjenci = new LinkedList<>();

        //Dodajemy pacjentów do kolejki
        pacjenci.add("Adam");
        pacjenci.add("Wiesław");
        pacjenci.add("Dorota");

        wypiszWszystkieElementyKolejkcji(pacjenci, "Przed operacjami: ");

        //Pobierz ale nie usuwaj pacjenta z kolejki
        String pacjentPeek = pacjenci.peek();
        wypiszWszystkieElementyKolejkcji(pacjenci, "Po wywołaniu metody howIsNext: ");

        //Pobierz ale i usuń pacjent z kolejki - co wyświetli ? FIFO
        String pacjentPool = pacjenci.poll();

        wypiszWszystkieElementyKolejkcji(pacjenci, "Po wywołaniu metody pool: ");
    }


    private static  void wypiszWszystkieElementyKolejkcji(Collection<String> collection, String message){
        System.out.println(message);

        for(String pacjent : collection){
            System.out.print(pacjent+ ",");
        }
        //Nowa linia - formatowanie
        System.out.println();
        System.out.println();
    }

}
