/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};

        int[] test = twoSum(nums2, 6);
        int[] test2 = twoSum(nums, 9);
        int[] test3 = twoSum(nums3, 6);

        for (int i : test) {
            System.out.print(i + " ");
        }

        /* Output [0, 0]
        * Expected [0, 1]
        */
    }

    public static int[] twoSum(int[] nums, int target) {
        int a = 0, b = 0;
        Integer[] arr = new Integer[nums.length]; // creating Integer[] to find index
        for (int k = 0; k < nums.length; k++) {
            arr[k] = nums[k];
        }

        bothLoops:
        for (Integer i : nums) {
            int[] arr2 = shorten(nums, Arrays.asList(arr).indexOf(i)); // finding index of i
            for (int j : arr2) {
                if (i + j == target) {
                    a = i;
                    b = j;
                    break bothLoops;
                }
            }
        }
        int[] res = {Arrays.asList(arr).indexOf(a), Arrays.asList(arr).indexOf(b)};
        return res;
    }

    public static int[] shorten(int[] nums, int index) {
        int[] array = new int[nums.length - 1];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i == index) {
                continue;
            }
            array[j++] = nums[i];
        }
        return array;
    }
}
