/**
 *  wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 *
 *  1.  The input string will always be lower case but maybe empty.
 *  2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 */

public class MexicanWave {
    public static void main(String[] args) {
        String[] result = wave("hello");
        for (String s: result) {
            System.out.print(s + " ");
        }
    }

    private static String[] wave(String str) {
        String[] result = new String[str.length()];

        for (int index = 0; index < str.length(); index++) {
            String s1 = str.substring(0, index);
            String s2 = str.substring(index).toUpperCase(); // change method to another / add second index
            String modified = s1 + s2;

            result[index] = modified;
        }

        return result;
    }
}
