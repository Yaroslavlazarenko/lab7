import java.util.Arrays;

public class Fractions {
    private final Fraction[] fractions;
    private int index;
    public Fraction fractionAddition;
    public Fraction fractionSubtraction;
    public Fraction fractionMultiplication;
    public Fraction R;

    public Fractions(int amount) {
        fractions = new Fraction[amount];
        index = -1;
    }

    public Fractions(Fraction ... fractions) {
        this.fractions = fractions;
    }

    public void setFraction(Fraction fraction) {
        if (++index < fractions.length)
            this.fractions[index] = fraction;
    }

    public Fraction getFraction(int index) {
        return this.fractions[index];
    }

    public void additionFractions(Fraction fraction1, Fraction fraction2) {
        double tempNumerator;
        double tempDenominator;

        tempDenominator = commonDivisor(fraction1.getDenominator(), fraction2.getDenominator());
        tempNumerator = fraction1.getNumerator() * (tempDenominator / fraction1.getDenominator()) +
                fraction2.getNumerator() * (tempDenominator / fraction2.getDenominator());
        this.fractionAddition = new Fraction(tempNumerator, tempDenominator);
    }

    public Fraction getAdditionFractions(Fraction fraction1, Fraction fraction2) {
        additionFractions(fraction1, fraction2);
        return this.fractionAddition;
    }

    public void subtractionFractions(Fraction fraction1, Fraction fraction2) {
        double tempNumerator;
        double tempDenominator;

        tempDenominator = commonDivisor(fraction1.getDenominator(), fraction2.getDenominator());
        tempNumerator = fraction1.getNumerator() * (tempDenominator / fraction1.getDenominator()) -
                fraction2.getNumerator() * (tempDenominator / fraction2.getDenominator());
        this.fractionSubtraction = new Fraction(tempNumerator, tempDenominator);
    }

    public Fraction getFractionSubtraction(Fraction fraction1, Fraction fraction2) {
        subtractionFractions(fraction1, fraction2);
        return this.fractionSubtraction;
    }

    public void multiplicationFractions(Fraction fraction1, Fraction fraction2) {
        double tempNumerator = fraction1.getNumerator() * fraction2.getNumerator();
        double tempDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        this.fractionMultiplication = new Fraction(tempNumerator, tempDenominator);
    }

    public Fraction getFractionMultiplication(Fraction fraction1, Fraction fraction2) {
        multiplicationFractions(fraction1, fraction2);
        return this.fractionMultiplication;
    }

    public void R(Fraction fraction1, Fraction fraction2, Fraction fraction3) {
        this.R = getFractionMultiplication(getAdditionFractions(fraction1, fraction2), getFractionSubtraction(fraction1, fraction3));
    }

    public String getR(Fraction fraction1, Fraction fraction2, Fraction fraction3) {
        R(fraction1,fraction2,fraction3);
        return "\nR = \n" + this.R;
    }

    public String getOneShareR(Fraction fraction1, Fraction fraction2, Fraction fraction3) {
        R(fraction1, fraction2, fraction3);
        return "\n1/R = \n" + this.R.getDenominator() + "\n-----\n" + this.R.getNumerator();
    }

    public double commonDivisor(double n1, double n2) {
        if (n2 == 0)
            return n1;
        return commonDivisor(n2, n1 % n2);
    }
}
