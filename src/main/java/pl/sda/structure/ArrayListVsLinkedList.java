package pl.sda.structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String args[]){
        arrayListIterator();

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2,33);
        linkedList.addFirst(0);
        linkedList.addLast(4);





    }

    private static void arrayListIterator() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        for(int i=0; i < arrayList.size(); i++){
            String s = arrayList.get(i);
            System.out.println(s);
        }

        for(String element : arrayList){
            System.out.println(element);
            arrayList.remove(0);
        }

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){

            String next = iterator.next();
            String next1 = iterator.next();
            iterator.remove();


        }
    }

}

