package codewars;

public class Tortoise {

    public static void main(String[] args) {
//        int[] t = race(720,850,70);
        int[] t = race(800, 91, 37);

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }

    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) {
            return new int[0];
        }

        int hours = g / (v2-v1);
        double hoursDouble = g / (double) (v2-v1);

        double minutesDouble = (hoursDouble - hours) * 60;
        int minutes = (int) minutesDouble;

        double secondsDouble =  (minutesDouble - minutes) * 60;
        int seconds = (int) secondsDouble;

        return new int[] {hours, minutes, seconds};
    }

}
