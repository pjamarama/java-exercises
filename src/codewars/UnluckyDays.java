/**
 * Friday 13th or Black Friday is considered as unlucky day. Calculate how many unlucky days are in the given year.
 * Find the number of Friday 13th in the given year.
 * <p>
 * Input: Year as an integer
 * Output: Number of Black Fridays in the year as an integer.
 * Examples:
 * unluckyDays(2015) == 3
 * unluckyDays(1986) == 1
 */

package codewars;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDays {
    public static void main(String[] args) {
//        System.out.println(unluckyDays(int year));
        unluckyDays();
    }

    //    private static int unluckyDays(int year) {
//        int result = 0;
//        return result;
//    }
    private static void unluckyDays(int year) {
        LocalDate localDate = LocalDate.of(year, 1, 1);
        DayOfWeek firstWeekdayOfYear = localDate.getDayOfWeek();
        
    }

}
