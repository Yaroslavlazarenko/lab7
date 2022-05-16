public class Untiled {
    public static boolean correctDenominator(double number) {
        return number != 0;
    }

    public static String formatNumber(double number) {
        return String.format("%.2f", number);
    }

    public static void properFraction(Fraction fraction) {
        double tempNumerator = fraction.getNumerator();
        double tempDenominator = fraction.getDenominator();


        double minNumberPlusOne = Math.min(tempNumerator, tempDenominator) + 1;
        for (int i = 2; i < minNumberPlusOne; i++) {
            if (tempNumerator % i == 0 && tempDenominator % i == 0) {
                fraction.setNumerator(tempNumerator / i);
                fraction.setDenominator(tempDenominator / i);
            }

        }


    }
}
