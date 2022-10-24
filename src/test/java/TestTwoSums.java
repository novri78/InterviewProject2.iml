import TwoSums.TwoSums;
import org.junit.Test;

import java.util.Arrays;

public class TestTwoSums extends TwoSums {

    @Test
    public void getTwoSumsTest() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int target = 3;
        System.out.print(Arrays.toString(getTwoSums(numbers, target)));
    }
}
