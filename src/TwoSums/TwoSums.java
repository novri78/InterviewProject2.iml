package TwoSums;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public TwoSums() {
    }

    public static void main(String[] args) {
    }

    public static int[] getTwoSums(int[] numbers, int target) {
        Map<Integer, Integer> vNumbers = new HashMap();

        for(int i = 0; i < numbers.length; ++i) {
            int delta = target - numbers[i];
            if (vNumbers.containsKey(delta)) {
                return new int[]{i, (Integer) vNumbers.get(delta)};
            }

            vNumbers.put(numbers[i], i);
        }

        return new int[]{-1, -1};
    }
}
