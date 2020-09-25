/**
 * You will be given an array a and a value x. All you need to do is check whether the provided array
 * contains the value.
 *
 * Array can contain numbers or strings. X can be either.
 *
 * Return true if the array contains the value, false if not.
 */

package codewars;

import java.util.Arrays;

public class YouOnlyNeedOne {
    public static void main(String[] args) {
        System.out.println(ifContains(new Character[] {'t','e','s','t'}, 'e'));
        System.out.println(ifContains2(new Character[] {'t','e','s','t'}, 'e'));
    }

    private static boolean ifContains2(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

    private static boolean ifContains(Object[] a, Object x) {
        for (Object object : a) {
            if (object.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
