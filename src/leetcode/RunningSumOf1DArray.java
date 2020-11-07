/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */

package leetcode;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        printArray(runningSum(new int[] {1,1,1,1,1}));
        printArray(runningSum(new int[] {1,2,3,4}));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            a += nums[i];
            result[i] = a;
        }

        return result;
    }

    private static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
