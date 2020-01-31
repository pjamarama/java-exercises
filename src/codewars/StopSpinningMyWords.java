/**
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five
 * or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters
 * and spaces. Spaces will be included only when more than one word is present.
 * <p>
 * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") =>
 * returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
 */

package codewars;

import java.util.ArrayList;

public class StopSpinningMyWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Stop Spinning My Words!"));
        System.out.println(spinWords2("Stop Spinning My Words!"));
    }

    public static String spinWords(String sentence) {
        ArrayList<String> wordsArray = new ArrayList<>();
        for (String word : sentence.split(" ")) {
            if (word.length() >= 5) {
                word = reverseWord(word);
            }
            wordsArray.add(word);
        }
        return new String().join(" ", wordsArray);
    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> punctuation = new ArrayList<>();
        for (int i = (word.length() - 1); i >= 0; i--) {
            if (!Character.isLetter(word.charAt(i))) {
                punctuation.add(word.charAt(i));
            } else {
                sb.append(word.charAt(i));
            }
        }
        for (char c : punctuation) {
            sb.append(c);
        }
        return sb.toString();
    }

    //    From Codewars' Best Practices
    public static String spinWords2(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}

