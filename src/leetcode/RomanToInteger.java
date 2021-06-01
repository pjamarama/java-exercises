/*
Given a roman numeral, convert it to an integer.
 */

package leetcode;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(convert("MCMLVIII"));
    }

    private static int convert(String s) {
        int result = 0;

        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case('M'):
                    arr[i] = 1000;
                    break;
                case('D'):
                    arr[i] = 500;
                    break;
                case('C'):
                    arr[i] = 100;
                    break;
                case('L'):
                    arr[i] = 50;
                    break;
                case('X'):
                    arr[i] = 10;
                    break;
                case('V'):
                    arr[i] = 5;
                    break;
                case('I'):
                    arr[i] = 1;
                    break;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result -= arr[i];
            } else {
                result += arr[i];
            }
        }
        return result + arr[arr.length-1];
    }
}
