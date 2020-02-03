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

public class DecompressRleList {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int result[] = decompressRLElist(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        if (nums.length % 2 != 0) {
            throw new IllegalArgumentException("Нечетное количество аргументов");
        }
        int arrayLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arrayLength += nums[i];
            }
        }
        int[] result = new int[arrayLength];

/*        for (int i = 0; i < result.length; i++) { //
            for (int j = 0; j < nums[i + 1]; j++) {
                result[i] = nums[i * 2 + 1];
            }
        }*/
        for (int i = 0; i < nums[i + 1]; i++) {
                        
        }


        return result;
    }
}
