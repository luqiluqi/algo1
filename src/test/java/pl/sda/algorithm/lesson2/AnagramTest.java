package pl.sda.algorithm.lesson2;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.algorithm.common.Anagram;

public class AnagramTest {

    private Anagram anagram;


    @Test
    public void isAnagram() {
        anagram = new Anagram();

        Assert.assertTrue(anagram.isAnagram("arc", "car"));
        Assert.assertTrue(anagram.isAnagram("night", "thing"));
        Assert.assertFalse(anagram.isAnagram("cat", "dog"));

        Assert.assertTrue(anagram.isAnagram("arc", "car"));
        Assert.assertTrue(anagram.isAnagram("night", "thing"));
        Assert.assertFalse(anagram.isAnagram("cat", "dog"));
    }
}