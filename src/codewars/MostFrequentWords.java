/**
 * Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of
 * the top-3 most occurring words, in descending order of the number of occurrences.
 * <p>
 * Assumptions:
 * A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII. (No need
 * to handle fancy punctuation.)
 * Matches should be case-insensitive, and the words in the result should be lowercased.
 * Ties may be broken arbitrarily.
 * If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned,
 * or an empty array if a text contains no words.
 * <p>
 * Examples:
 * top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
 * # => ["e", "ddd", "aa"]
 * <p>
 * top_3_words("  //wont won't won't")
 * # => ["won't", "wont"]
 */

package codewars;

import java.util.*;
import java.util.stream.Collectors;

// create a map, iterate through the list filling the map
// replace all punctuation marks with a space str.replaceAll("[^a-zA-Z]", " ")
// iterate through the map, get 3 keys (words) with the biggest values (usages)
// create String array containing these keys, return this array

public class MostFrequentWords {
    public static List<String> top3(String s) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        s = s.replaceAll("[^a-zA-Z']", " ").toLowerCase();
        String[] splittedWords = s.split(" ");
        for (String word : splittedWords) {
            if (!word.equals(" ") && !word.equals("")) {
                addToMap(word, frequencyMap);
            }
        }

        return findMostFrequentWords(frequencyMap);
    }

    private static void addToMap(String word, Map<String, Integer> frequencyMap) {
        if (frequencyMap.containsKey(word)) {
            frequencyMap.put(word, frequencyMap.get(word) + 1);
        } else {
            frequencyMap.put(word, 1);
        }
    }

    private static List<String> findMostFrequentWords(Map<String, Integer> frequencyMap) {

        Map<String, Integer> sortedFrequencyMap = frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new)
                );

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(sortedFrequencyMap.entrySet());
        List<String> result = new ArrayList<>();

        try {
            for (int i = 1; i < 4; i++) {
                result.add(entryList.get(entryList.size() - i).getKey());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        System.out.println(top3("a a a  b  c c  d d d d  e e e e e"));
        System.out.println(top3("wont won't won't"));
        System.out.println(top3("  '''  "));
    }
}
