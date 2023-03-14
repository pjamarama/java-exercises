import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
    private static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([}}])"));
    }
}
