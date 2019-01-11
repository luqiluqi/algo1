package pl.sda.structure.linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySingleLinedListTest {


    @Test
    public void testGet() {
        MySingleLinedList linedList = new MySingleLinedList();

        linedList.add(0, 0);
        linedList.add(1, 1);
        linedList.add(2, 1);
        linedList.add(3, 1);
        linedList.add(0, 1);


        assertEquals(linedList.size(), 5);
        assertEquals(linedList.get(0).getData(), 0);
        assertEquals(linedList.get(1).getData(), 1);

    }

    @Test
    public void testAdd2(){
        MySingleLinedList linedList = new MySingleLinedList();

        linedList.add(0,1);
        linedList.add(1,2);
        linedList.add(1,3);

        assertEquals(linedList.size(), 3);

    }


    @Test
    public void testAdd() {

    }


}