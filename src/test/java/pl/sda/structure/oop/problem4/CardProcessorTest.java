package pl.sda.structure.oop.problem4;

import org.junit.Assert;
import org.junit.Test;

public class CardProcessorTest {

    private CardProcessor processor;


    @Test
    public void GetCardType() {
        processor = new CardProcessor();

        Assert.assertEquals("VISA", processor.getCardType("451111111111111122"));
        Assert.assertEquals("Unknown", processor.getCardType("4111"));

        Assert.assertEquals("VISA", processor.getCardType("451111111111111234"));
        Assert.assertEquals("VISA", processor.getCardType("451111111111111142"));
        Assert.assertEquals("VISA", processor.getCardType("451111111111111654"));

        Assert.assertEquals("AmericanExpress", processor.getCardType("6011111111111111"));
        Assert.assertEquals("AmericanExpress", processor.getCardType("6511111111111111"));

        Assert.assertEquals("MASTERCARD", processor.getCardType("3511111111111111"));
        Assert.assertEquals("MASTERCARD", processor.getCardType("35111111111111111"));
        Assert.assertEquals("MASTERCARD", processor.getCardType("351111111111111111"));
    }

}