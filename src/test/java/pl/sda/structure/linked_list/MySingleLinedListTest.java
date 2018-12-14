package pl.sda.structure.linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySingleLinedListTest {


    @Test
    public void testGet() {
        MySingleLinedList linedList = new MySingleLinedList();

        linedList.add(0, new String());
        linedList.add(1, new String());

        assertEquals(linedList.size(), 2);
    }

    @Test
    public void testAdd() {

    }


}