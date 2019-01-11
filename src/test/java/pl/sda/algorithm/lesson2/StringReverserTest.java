package pl.sda.algorithm.lesson2;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.algorithm.common.StringReverser;

public class StringReverserTest {

    private StringReverser stringReverser;

    @Test
    public void ReverseString() {
        stringReverser = new StringReverser();
        // "abc" => "cba"
        Assert.assertEquals("olleH", stringReverser.reverse1("Hello"));
        Assert.assertEquals("dlroW", stringReverser.reverse1("World"));

        Assert.assertEquals("Witaj", stringReverser.reverse2("jatiW"));
        Assert.assertEquals("Swiecie", stringReverser.reverse2("eiceiwS"));
    }

}