package functions;

import exceptions.ArgumentOutOfBoundException;
import exceptions.BoundsException;
import interfaces.IRealFunction;

public class ASinBx implements IRealFunction {

    private double lowerBound, upperBound, a, b;

    public ASinBx(final double lowerBound,
                        final double upperBound,
                        final double a,
                        final double b) throws BoundsException {
        if (lowerBound > upperBound) {
            throw new BoundsException("Lower bound should be less than upper bound");
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.a = a;
        this.b = b;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public double calculate(double x) throws ArgumentOutOfBoundException {
        if (x > getUpperBound()) {
            throw new ArgumentOutOfBoundException("x is more than upper bound");
        }
        if (x < getLowerBound()) {
            throw new ArgumentOutOfBoundException("x is less than lower bound");
        }
        return a * Math.sin(b * x);
    }
}
