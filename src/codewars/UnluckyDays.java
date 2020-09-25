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
        System.out.println(check13thDay(2016));
    }

    /**
     * Method runs a loop for 12 months for the given year and checks if the 13th day of each month is Friday.
     * Int value of a year is accepted, and number of Frdays 13 is returned as int
     *
     * @param year
     * @return
     */
    private static int check13thDay(int year) {
        int amountOfFridays13 = 0;
        for (int month = 1; month < 13; month++) {
            LocalDate day13 = LocalDate.of(year, month, 13);
            if (day13.getDayOfWeek() == DayOfWeek.FRIDAY) {
                amountOfFridays13++;
            }
        }
        return amountOfFridays13;
    }
}
