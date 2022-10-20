import org.junit.Assert;
import org.junit.Test;

public class GraderTest {
    @Test
    public void fiftyNineReturnF(){
        var grader = new Grader();
        Assert.assertEquals('F', grader.resultOfGrade(59));
    }
    @Test
    public void sixtyNineReturnD(){
        var grader = new Grader();
        Assert.assertEquals('D', grader.resultOfGrade(69));
    }
    @Test
    public void seventyNineReturnC(){
        var grader = new Grader();
        Assert.assertEquals('C', grader.resultOfGrade(79));
    }
    @Test
    public void eightyNineReturnB(){
        var grader = new Grader();
        Assert.assertEquals('B', grader.resultOfGrade(89));
    }
    @Test
    public void ninetyTwoReturnA(){
        var grader = new Grader();
        Assert.assertEquals('A', grader.resultOfGrade(92));
    }
    @Test
    public void zeroReturnF(){
        var grader = new Grader();
        Assert.assertThrows(IllegalArgumentException.class,
                () -> grader.resultOfGrade(-1));
    }

}