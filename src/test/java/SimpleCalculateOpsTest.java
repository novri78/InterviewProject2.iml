import Calculator.SimpleCalculateOps;
import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculateOpsTest {
    @Test
    public void addSevenAndTenEqualSeventeen(){
        var simpleCalculateOps = new SimpleCalculateOps();
        Assert.assertEquals(17, SimpleCalculateOps.add(7,10));
    }
    @Test
    public void addEightAndNineEqualSeventeen(){
        var simpleCalculateOps = new SimpleCalculateOps();
        Assert.assertEquals(17, SimpleCalculateOps.add(8,9));
    }
    @Test
    public void addElevenAndSixEqualSeventeen(){
        var simpleCalculateOps = new SimpleCalculateOps();
        Assert.assertEquals(17, SimpleCalculateOps.add(11,6));
    }
    @Test
    public void subtractElevenAndSixEqualFive() {
        var simpleCalculateOps = new SimpleCalculateOps();
        Assert.assertEquals(5, SimpleCalculateOps.subtract(11, 6));
    }
    @Test
    public void multilpyTwoAndSixEqualTwelve(){
        var simpleCalculateOps = new SimpleCalculateOps();
        Assert.assertEquals(12, SimpleCalculateOps.multiply(2,6));
    }
    @Test
    public void divideNineAndTwoEqualSeventeen() {
        var simpleCalculateOps = new SimpleCalculateOps();
        Assert.assertEquals(3, SimpleCalculateOps.divide(6, 2));
    }

}