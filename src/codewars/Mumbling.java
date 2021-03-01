/*
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

package codewars;

import java.util.Collections;

public class Mumbling {
    public static void main(String[] args) {
        System.out.printf(accumNaive("cwAt"));
    }

    private static String accumNaive(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(replicateLetter(s.charAt(i), i));
            sb.append("-");
        }

        return sb.substring(0, sb.length() - 1);
    }

    private static String replicateLetter(char c, int order) {
        String result = String.join("", Collections.nCopies(order + 1, String.valueOf(c).toLowerCase()));
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }


}
