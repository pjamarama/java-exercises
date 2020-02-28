/**
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 * <p>
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
 * // => returns "(123) 456-7890"
 */
package codewars;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createFromKata(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    static String createPhoneNumber(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result.append(numbers[i]);
        }
        return result.toString().replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
    }

    static String createFromKata(int[] numbers) {
        String result = "(xxx) xxx-xxxx";
        for (int i : numbers) {
            result = result.replaceFirst("x", Integer.toString(i));
        }
        return result;
    }
}
