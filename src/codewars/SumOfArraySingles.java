/**
 * Gven an array of numbers in which two numbers occur once and the rest occur only twice.
 * Your task will be to return the sum of the numbers that occur only once.
 * <p>
 * For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.
 */

package codewars;

import java.util.HashMap;
import java.util.Map;

public class SumOfArraySingles {
    public static void main(String[] args) {
        int[] arr = {4,5,7,5,4,8};
        System.out.println(repeats(arr));
    }

    public static int repeats(int[] arr) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int result = 0;

        for (int i : arr) {
            if (numbers.containsKey(i)) {
                numbers.put(i, numbers.get(i) + 1);
            } else {
                numbers.put(i, 1);
            }
        }

        for (Integer i : numbers.keySet()) {
            if (numbers.get(i) == 1) {
                result += i;
            }
        }

        return result;
    }

    /*
    using streams
        public static int repeats(int[] arr) {
        return 2 * IntStream.of(arr).distinct().sum() - IntStream.of(arr).sum();
    }
     */
}
