public class Fraction {
    private final double numerator;
    private final double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator() {
        return this.numerator;
    }

    public double getDenominator() {
        return this.denominator;
    }

    @Override
    public String toString() {
        return this.numerator + "\n-----\n" + this.denominator;
    }
}
