import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        double numerator;
        double denominator;

        System.out.println("Enter a1:");
        numerator = scanner.nextDouble();
        do {
            System.out.print("Enter b1: ");
            denominator = scanner.nextDouble();
        } while (!Untiled.correctDenominator(denominator));
        Fraction fraction1 = new Fraction(numerator, denominator);

        System.out.println("Enter a2:");
        numerator = scanner.nextDouble();
        do {
            System.out.print("Enter b2: ");
            denominator = scanner.nextDouble();
        } while (!Untiled.correctDenominator(denominator));
        Fraction fraction2 = new Fraction(numerator, denominator);

        System.out.println("Enter a3:");
        numerator = scanner.nextDouble();
        do {
            System.out.print("Enter b3: ");
            denominator = scanner.nextDouble();
        } while (!Untiled.correctDenominator(denominator));
        Fraction fraction3 = new Fraction(numerator, denominator);

        final Fractions fractions = new Fractions(fraction1,fraction2,fraction3);

        System.out.println(fractions.getR(fraction1,fraction2,fraction3));
        System.out.println(fractions.getOneShareR(fraction1,fraction2,fraction3));

        System.out.println(fractions.getAdditionFractions(fraction1,fraction2));

    }
}
