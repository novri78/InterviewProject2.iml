package Palyndrome;

import org.junit.Assert;
import org.junit.Test;

public class TestPalindrome extends PalyndromeTest{

    @Test
    public void test() {
        Assert.assertTrue(this.isPalyndrome("abba"));
    }

    @Test
    public void testPalyndrome() {
        Assert.assertTrue(this.isPalyndrome("a"));
        Assert.assertFalse(this.isPalyndrome("abca"));
        Assert.assertTrue(this.isPalyndrome(""));
        Assert.assertFalse(this.isPalyndrome("asztsa"));
        Assert.assertTrue(this.isPalyndrome("delled"));
        Assert.assertFalse(this.isPalyndrome("kentang"));
    }
}
