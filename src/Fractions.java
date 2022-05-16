public class Fractions {
    private final Fraction[] fractions;
    private int index;

    public Fractions(int amount,) {
        fractions = new Fraction[amount];
        index = -1;
    }

    public void setFraction(Fraction fraction) {
        if(++index<fractions.length)
            this.fractions[index] = fraction;
    }

    public Fraction getFraction(int index) {
        return this.fractions[index];
    }
}
