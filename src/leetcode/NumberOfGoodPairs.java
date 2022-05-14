/**
 * Given an array of integers nums.
 *
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 *
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 */

package leetcode;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,1,1,3};
        int[] nums2 = new int[] {1,1,1,1};
        System.out.println(countGoodPairs(nums1));
        System.out.println(countGoodPairs(nums2));
    }

    private static int countGoodPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int element1 = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int element2 = nums[j];

                if (element1 == element2) {
                    count++;
                }
            }
        }
        return count;
    }
}
