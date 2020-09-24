/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 */

package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,4,3,2,1};
        int[] array2 = {2,5,1,3,4,7};

        System.out.println(Arrays.toString(shuffle(array1, 4)));
        System.out.println(Arrays.toString(shuffle(array2, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n] ;

        for (int i = 0; i < 2 * n ; i++) {
            result[i] = (i % 2 != 0) ? (result[i] = nums[n + i / 2]) : (nums[i/2]);
        }

        return result;
    }
}
