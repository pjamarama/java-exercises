/*
Write a function that takes a string of braces, and determines if the order of the braces is valid.
It should return true if the string is valid, and false if it's invalid.

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
 */

package codewars;

import java.util.Stack;

public class validBraces {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("(}"));
        System.out.println(isValid("[(])"));
        System.out.println(isValid("()("));

    }

    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        try {
            for (char c : braces.toCharArray()) {
                if (c == '{' || c == '[' || c == '(') {
                    stack.push(c);
                }
                if (c == '}' || c == ']' || c == ')') {
                    char openBrace = stack.pop();
                    if (!openCloseCheck(openBrace, c)) {
                        return false;
                    }
                }
            }
        } catch (java.util.EmptyStackException e) {
            return false;
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean openCloseCheck(char openBrace, char closeBrace) {
        return (openBrace == '{' && closeBrace == '}' ||
                openBrace == '[' && closeBrace == ']' ||
                openBrace == '(' && closeBrace == ')');
    }
}
