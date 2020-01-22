package codewars;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {
    public static void main(String[] args) {
/*        String letters = "Abc Dec";
        Map<Character, Integer> map = new HashMap<>();
        String nonAlpha = letters.replaceAll("[^A-Za-z]", "");
        for (char c : nonAlpha.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);
        }*/

        System.out.println(check("The quick brown fox jumps over the lazy dog"));
        System.out.println(check("Pack my box with five dozen liquor jugs."));
    }

    static boolean check(String sentence) {
        /*
       1. create hashmap from sentence
       2. return (map.size() == 26)
        * */
        Map<Character, Integer> map = new HashMap<>();
        String nonAlphaSentence = sentence.replaceAll("[^A-Za-z]", "").toLowerCase();
        for (char c : nonAlphaSentence.toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }
        return map.size() == 26;
    }
}
