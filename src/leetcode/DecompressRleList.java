/**
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * <p>
 * Consider each adjacent pair of elements [a, b] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair,
 * there are a elements with value b in the decompressed list.
 * <p>
 * Return the decompressed list.
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4,4] is [2,4,4,4].
 */

package leetcode;

import java.util.ArrayList;

public class DecompressRleList {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int result[] = decompressRLElist(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        int arrayLength = 0;
        ArrayList<Integer> freq = new ArrayList<>();
        ArrayList<Integer> val = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        if (nums.length % 2 != 0) {
            throw new IllegalArgumentException("Нечетное количество аргументов");
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arrayLength += nums[i];
            }
        }
        int[] res = new int[arrayLength];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                val.add(nums[i]);
            } else {
                freq.add(nums[i]);
            }
        }
        /*Decompress the given array by repeating nums[2*i+1] a number of times equal to nums[2*i].*/
        for (int i = 1; i < arrayLength; i++) {
            for (int j = 0; j < nums[2 * i]; j++) {
                result.add(nums[2 * i + 1]);
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            res[i] = result.get(i);
        }


        return res;
    }
}
