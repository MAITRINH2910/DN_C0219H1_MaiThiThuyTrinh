import static java.lang.Math.pow;

public class Account {

    private double a;
    private double b;
    private double c;

    public Account() {

    }

    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return pow(getB(), 2) - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + pow(getDiscriminant(), 0.5)) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - pow(getDiscriminant(), 0.5)) / (2 * getA());
    }
}
