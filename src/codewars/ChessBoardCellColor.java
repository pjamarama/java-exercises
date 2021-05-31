/*
Given two cells on the standard chess board, determine whether they have the same color or not.

Example:
For cell1 = "A1" and cell2 = "C3", the output should be true.
 */

package codewars;

public class ChessBoardCellColor {
    public static void main(String[] args){
        System.out.println(isSameColor("A2", "C3"));
    }

    static boolean isSameColor(String cell1, String cell2) {
        return ((cell1.charAt(0) + cell1.charAt(1)) % 2) == ((cell2.charAt(0) + cell2.charAt(1)) % 2);
    }
}
