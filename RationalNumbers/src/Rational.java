public class Rational {
    private int numerator;  //the number above the line
    private int denominator; //the number above the line


    public Rational(int numerator, int denominator) throws IllegalArgumentException {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Rational() {
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) throws IllegalArgumentException {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("Cannot assign zero as a denominator!");
        } else if (denominator < 0) { //The assignment defined a rational number as a number with a positive denominator
            setNumerator(numerator * -1);
            denominator = denominator * -1;
        }
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        Rational rational = (Rational) o;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    public boolean greaterThan(Rational num) {
        return this.numerator * num.denominator > num.numerator * this.denominator;
    }

    public Rational plus(Rational num) {
        int newNumerator = (this.numerator * num.denominator) + (num.numerator * this.denominator);
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational minus(Rational num) {
        int newNumerator = (this.numerator * num.denominator) - (num.numerator * this.denominator);
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational num) {
        int newNumerator = this.numerator * num.numerator;
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational num) throws ArithmeticException {
        if (num.denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return this.multiply(new Rational(num.denominator, num.numerator));
    }

    @Override
    public String toString() {
        if (numerator == denominator) {
            return "1";
        } else if (numerator == 0) {
            return "0";
        }
        return numerator + "/" + denominator;
    }

    public Rational reduce() {
        int divisor = gcd(this.numerator, this.denominator);
        return new Rational(numerator / divisor, denominator / divisor);
    }

    private int gcd(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator;
        }
        return gcd(denominator, numerator % denominator);
    }
}
