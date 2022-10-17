package PrimeNumber;

import org.junit.Assert;
import org.junit.Test;

public class TestPrime extends Prime{
    @Test
    public void testPrime(){
        Assert.assertFalse(isPrimeNumber(8));
        Assert.assertTrue(isPrimeNumber(17));
        Assert.assertTrue(isPrimeNumber(13));
        Assert.assertFalse(isPrimeNumber(72));
    }


}
