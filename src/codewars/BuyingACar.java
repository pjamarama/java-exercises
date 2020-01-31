package codewars;

public class BuyingACar {
    public static void main(String[] args) {

    }

    public static int[] nbMonths (float startPriceOld, float startPriceNew,
                                  float savingPerMonth, float percentLossByMonth) {
        while ((savingPerMonth + startPriceOld) > startPriceNew) {
            int month = 1;
            if (month % 2 == 0) {
                percentLossByMonth += 0.5;
            }
            month +=1;
            savingPerMonth += 1000;
        }
        return null;
    }
}
