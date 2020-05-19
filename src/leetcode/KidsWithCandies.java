/**
 * Kids With the Greatest Number of Candies
 * <p>
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that
 * the ith kid has.
 * <p>
 * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have
 * the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
 */

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        System.out.println(kidsWithCandies(candies, 10));
        System.out.println(Arrays.toString(candies));


    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = findMaxValue(candies);
        List<Boolean> result = new ArrayList<>();
        for (int i : candies) {
            result.add(i + extraCandies >= maxValue);
        }
        return result;
    }

    private static int findMaxValue(int[] array) {
        int maxValue = 0;
        for (int i : array) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }
}
