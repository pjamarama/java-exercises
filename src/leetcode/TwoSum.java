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

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums2 = {2, 3, 4, 7};
        int[] nums3 = {3, 3};
        int[] nums1 = {2, 5, 7};

//        for (int i : twoSumsBrute(nums3, 6)) {
//            System.out.println(i);
//        }

        for (int i : twoSumsMap(nums2, 11)) {
            System.out.println(i);
        }

        for (int i : twoSumOneGo(nums3, 6)) {
            System.out.println(i);
        }

    }

    private static Map<Integer, Integer> getMap(int[] nums) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }
        return indexMap;
    }

    static int[] twoSumsMap(int[] nums, int target) {
        Map<Integer, Integer> map = getMap(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j) && map.get(j) != i) {
                return new int[]{i, map.get(j)};
            }
        }
        throw new IllegalArgumentException("Target not valid");
    }

    static int[] twoSumsBrute(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    return new int[]{x, y};
                }
            }
        }
        throw new IllegalArgumentException("Target not valid");
    }

    //  check the elements while adding to map
    static int[] twoSumOneGo(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (indexMap.containsKey(j)) {
                return new int[]{indexMap.get(j), i};
            }
            indexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("Target not valid");
    }
}
