/**
 You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 The array is either entirely comprised of odd integers or entirely comprised of even integers except for
 a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

 [2, 4, 0, 100, 4, 11, 2602, 36]
 Should return: 11 (the only odd number)

 [160, 3, 1719, 19, 11, 13, -21]
 Should return: 160 (the only even number)
 */

public class FindTheParityOutliner {
    public static void main(String[] args) {
        int[] arr1 = new int[] {2, 4, 0, 100, 4, 11, 2602, 36};
        int[] arr2 = new int[] {160, 3, 1719, 19, 11, 13, -21};

        System.out.println(find(arr1));
        System.out.println(find(arr2));
    }

    private static int find(int[] integers) {
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 != 0) {
                countOdd++;
            } else {
                countEven++;
            }
        }

        if (countOdd > countEven) {
            return findOutliner(integers, true);
        } else {
            return findOutliner(integers, false);
        }
    }

    private static int findOutliner(int[] ints, boolean isOutlinerEven) {
        for (int i : ints) {
            if (isOutlinerEven && i % 2 == 0) {
                return i;
            } else if (!isOutlinerEven && i % 2 != 0) {
                return i;
            }
        }
        return 0;
    }
}
