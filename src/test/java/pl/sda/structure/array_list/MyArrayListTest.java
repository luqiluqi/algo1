package pl.sda.structure.array_list;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {


    @Test
    public void get() {
        MyArrayList arrayList = new MyArrayList();

        int newElement = 10;
        arrayList.add(newElement);

        int byIndex = arrayList.get(0);
        assertEquals(newElement, byIndex);
    }

    @Test
    public void set() {
        MyArrayList arrayList = new MyArrayList();

        int newElement = 10;
        arrayList.add(newElement);

        int byIndex = arrayList.get(0);
        assertEquals(newElement, byIndex);
    }


    @Test
    public void remove() {
        MyArrayList arrayList = new MyArrayList();

        int newElement = 10;
        arrayList.add(newElement);

        int removed = arrayList.remove(0);

        assertEquals(newElement, removed);
    }
}