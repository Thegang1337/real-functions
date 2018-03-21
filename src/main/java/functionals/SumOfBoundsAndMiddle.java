package functionals;

import exceptions.ArgumentOutOfBoundException;
import exceptions.MathDividingException;
import interfaces.IFunctional;
import interfaces.IRealFunction;

public class SumOfBoundsAndMiddle implements IFunctional<IRealFunction> {

    public double calculate(IRealFunction f) throws ArgumentOutOfBoundException, MathDividingException {
        return f.calculate(f.getLowerBound()) +
                f.calculate(f.getUpperBound()) +
                f.calculate(f.getLowerBound() + (f.getUpperBound() - f.getLowerBound()) * 0.5);
    }
}
