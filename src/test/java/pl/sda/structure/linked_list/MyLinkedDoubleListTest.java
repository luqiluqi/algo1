package pl.sda.structure.linked_list;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyLinkedDoubleListTest {


    @Test
    public void addFirst() {
        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.addFirst("Test1");
        linkedList.addFirst("Test2");
        linkedList.addFirst("Test3");
        linkedList.addFirst("shouldBeFirst");

        assertEquals(linkedList.size(), 4);
        assertEquals(linkedList.getFirst().getData(), "shouldBeFirst");

    }

    @Test
    public void addLast() {

        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.addLast("Test1");
        linkedList.addLast("Test2");
        linkedList.addLast("Test3");
        linkedList.addLast("Test4");
        linkedList.addLast("ShouldBeLast");

        assertEquals(linkedList.size(), 5);
        assertEquals(linkedList.getLast().getData(), "ShouldBeLast");

    }

    @Test
    public void getNodeWhenAddingOnLastElement() {

        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.addLast("Test1");
        linkedList.addLast("Test2");
        linkedList.addLast("Test3");
        linkedList.addLast("Test4");
        linkedList.addLast("ShouldBeLast");

        assertEquals(linkedList.size(), 5);
        assertEquals(linkedList.getNode(0).getData(), "Test1");
        assertEquals(linkedList.getNode(1).getData(), "Test2");
        assertEquals(linkedList.getNode(2).getData(), "Test3");
        assertEquals(linkedList.getNode(3).getData(), "Test4");
        assertEquals(linkedList.getNode(4).getData(), "ShouldBeLast");


    }

    @Test
    public void getNodeWhenAddingOnFirstElement(){
        MyLinkedDoubleList<String> newLinkedList = new MyLinkedDoubleList<>();
        newLinkedList.addFirst("Test1");
        newLinkedList.addFirst("Test2");
        newLinkedList.addFirst("Test3");
        newLinkedList.addFirst("Test4");
        newLinkedList.addFirst("ShouldBeFirst");


        assertEquals(newLinkedList.size(), 5);
        assertEquals(newLinkedList.getNode(0).getData(), "ShouldBeFirst");
        assertEquals(newLinkedList.getNode(1).getData(), "Test4");
        assertEquals(newLinkedList.getNode(2).getData(), "Test3");
        assertEquals(newLinkedList.getNode(3).getData(), "Test2");
        assertEquals(newLinkedList.getNode(4).getData(), "Test1");
    }


    @Test
    public void isEmpty() {
        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.addLast("Test1");
        linkedList.addLast("Test2");

        assertEquals(linkedList.isEmpty(), false);


        MyLinkedDoubleList<String> emptyList = new MyLinkedDoubleList<>();
        assertEquals(emptyList.isEmpty(), true);

    }

    @Test
    public void size() {
        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.addLast("Test1");
        linkedList.addLast("Test2");

        assertEquals(linkedList.size(), 2);


        MyLinkedDoubleList<String> emptyList = new MyLinkedDoubleList<>();
        assertEquals(emptyList.size(), 0);
    }

    @Test
    public void add() {
        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.add("Test1");
        linkedList.add("Test2");
        linkedList.add("Test3");


        assertEquals(linkedList.size(), 3);
        assertEquals(linkedList.getLast().getData(), "Test3");
        assertEquals(linkedList.getFirst().getData(), "Test1");

        assertEquals(linkedList.getNode(0).getData(), "Test1");
        assertEquals(linkedList.getNode(1).getData(), "Test2");
        assertEquals(linkedList.getNode(2).getData(), "Test3");

    }

    @Test
    public void addOnIndex() {
        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.add(0, "Test1");
        linkedList.add(1, "Test2");
        linkedList.add(2, "Test3");
        linkedList.add(1, "AddedBetween");

        assertEquals(linkedList.size(), 4);
    }

    @Test
    public void testPoll(){

        MyLinkedDoubleList<String> linkedList = new MyLinkedDoubleList<>();

        linkedList.add(0, "Test1");
        linkedList.add(1, "Test2");
        linkedList.add(2, "Test3");

        String test1 = linkedList.poll();
        String test2 = linkedList.poll();

        assertEquals(linkedList.size(), 1);
        assertEquals(test1, "Test1");
        assertEquals(test2, "Test2");

    }


}