/**
 * Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
 *
 * Your task is to process a string with "#" symbols.
 */

package codewars;

import java.util.EmptyStackException;
import java.util.Stack;

public class BackspacesInString {

    public static String cleanString(String s) {

        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            processCharacter(s.charAt(i), characterStack);
        }

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {

            try {
                result.append(characterStack.pop());
            } catch (EmptyStackException e) {
                return result.reverse().toString();
            }
        }

        return result.reverse().toString();
    }

    public static Stack<Character> processCharacter(Character c, Stack<Character> stack) {

        if (!c.equals('#')) {
            stack.push(c);
        } else {
            try {
                stack.pop();
            } catch (EmptyStackException e) {
                return stack;
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        System.out.println(cleanString("abc##d######"));

    }
}
