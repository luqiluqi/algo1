package pl.sda.algorithm.lesson2;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.algorithm.common.IntReverser;

public class IntReverserTest {

    @Test
    public void ReverseInt() {
        IntReverser intReverser = new IntReverser();
        // x = 123, return 321
        // x= -123, return -321
        Assert.assertEquals(321, intReverser.reverse(123));
        Assert.assertEquals(-321, intReverser.reverse(-123));
    }

}