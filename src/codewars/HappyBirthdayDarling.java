/**
 * As you may know, once some people pass their teens, they jokingly only celebrate their 20th or 21st birthday,
 * forever. With some maths skills, that's totally possible - you only need to select the correct number base!
 *
 * For example, if they turn 32, that's exactly 20 - in base 16... Already 39? That's just 21, in base 19!
 *
 * Your task is to translate the given age to the much desired 20 (or 21) years, and indicate the number base,
 * in the format specified below.
 *
 * Note: input will be always > 21
 *
 * Examples:
 *
 * 32  -->  "32? That's just 20, in base 16!"
 */

package codewars;

public class HappyBirthdayDarling {
    public static void main(String[] args) {
//        System.out.println(womensAge(32));
//        System.out.println(womensAge(39));
        System.out.println(womensAge(22));
//        System.out.println(womensAge(65));
//        System.out.println(womensAge(83));
    }

    static String womensAge(int n) {
        int base = n / 2;
        int twenties;
        if (n % 2 == 0) {
            twenties = 20;
        } else {
            twenties = 21;
        }
        return String.format("%d? That's just %d, in base %d!", n, twenties, base);
    }
}
