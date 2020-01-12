/**
 * Trolls are attacking your comment section!
 * A common way to deal with this situation is to remove all of the vowels from the trolls'
 * comments, neutralizing the threat.
 *
 * Your task is to write a function that takes a string and return a new string with all
 * vowels removed.
 *
 * For example, the string "This website is for losers LOL!" would become
 * "Ths wbst s fr lsrs LL!".
 *
 * Note: for this kata y isn't considered a vowel.
 */

package codewars;

public class DisemvowelTrolls {
    public static void main(String[] args) {

        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowelRegex("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel (char c) {
        for (char x : "AEIOUaeiou".toCharArray()) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }

    public static String disemvowelRegex(String str) {
        return str.replaceAll("(?i)[aouie]", "");
    }
}
