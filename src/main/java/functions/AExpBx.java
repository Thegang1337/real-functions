package functions;

import exceptions.ArgumentOutOfBoundException;
import exceptions.BoundsException;
import interfaces.IRealFunction;

public class AExpBx implements IRealFunction {
    private double lowerBound, upperBound, a, b;

    public AExpBx(double lowerBound,
                  double upperBound,
                  double a,
                  double b) throws BoundsException {
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
        if (x < getLowerBound()) {
            throw new ArgumentOutOfBoundException("x is less than lower bound");
        }
        if (x > getUpperBound()) {
            throw new ArgumentOutOfBoundException("x is more than upper bound");
        }
        return a * Math.exp(b * x);
    }
}
