/*
use 2 pointers and max non-repeating int
use hash set to store symbols, set inserting goes as O(1)

2nd pointer goes for every symbol from 1st pointer to the end of the string.
if set does not contain a symbol at 2nd pointer, add the symbol to the set, increment max, increment 2nd pointer
if doesn't, clear set, increment 1st counter
return max
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    private static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            } else {
                set.clear();
                i++;
                j = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
