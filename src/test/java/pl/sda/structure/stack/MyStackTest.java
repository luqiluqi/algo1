package pl.sda.structure.stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(BlockJUnit4ClassRunner.class)
public class MyStackTest {

    @Test
    public void push() {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3,stack.size());
    }

    @Test
    public void pop() {

        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);


        stack.pop();
        assertEquals(2,stack.size());

        stack.pop();
        assertEquals(1,stack.size());

        stack.pop();
        assertEquals(0,stack.size());
    }
}
