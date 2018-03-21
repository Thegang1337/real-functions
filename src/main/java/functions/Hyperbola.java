package functions;

import exceptions.ArgumentOutOfBoundException;
import exceptions.BoundsException;
import exceptions.MathDividingException;
import interfaces.IRealFunction;

public class Hyperbola implements IRealFunction {
    private double lowerBound, upperBound, a, b, c, d;

    public Hyperbola(double lowerBound, double upperBound,
                     double a, double b,
                     double c, double d) throws BoundsException {
        if (lowerBound > upperBound) {
            throw new BoundsException("Lower bound should be less than upper bound");
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public double calculate(double x) throws ArgumentOutOfBoundException, MathDividingException {
        if (x > getUpperBound()) {
            throw new ArgumentOutOfBoundException("x is more than upper bound");
        }
        if (x < getLowerBound()) {
            throw new ArgumentOutOfBoundException("x is less than lower bound");
        }
        double divider = c * x + d;                 //делитель
        if (divider == 0) {
            throw new MathDividingException("Dividing by zero");
        }
        return (a * x + b) / divider;
    }
}
