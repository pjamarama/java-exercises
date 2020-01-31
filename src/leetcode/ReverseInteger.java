/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Input: 123
 * Output: 321
 * <p>
 * Input: -123
 * Output: -321
 * <p>
 * Input: 120
 * Output: 21
 */

package leetcode;

import java.util.ListIterator;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

    public static int reverse(int x) {
        if (x < -2e31 && x > 2e31 - 1) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();

//        probably we can use a list instead of stack
        Stack<Character> stack = new Stack<>();

//        Fill stack with digit characters
        String str = Integer.toString(x);
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c);
            }
        }

//        iterate over the stack from top to bottom
        ListIterator<Character> iter = stack.listIterator(stack.size());
        while (iter.hasPrevious()) {
            char c = iter.previous();
            sb.append(c);
        }
        return x > 0 ? Integer.parseInt(sb.toString()) : -Integer.parseInt(sb.toString());
    }
}
