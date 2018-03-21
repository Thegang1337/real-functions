package functionals;

import exceptions.ArgumentOutOfBoundException;
import exceptions.MathDividingException;
import interfaces.IFunctional;
import interfaces.IRealFunction;

public class DefiniteIntegral implements IFunctional<IRealFunction> {
    private static double FRAGMENTATION = 16384;
    private double a, b;

    public DefiniteIntegral(double a, double b) throws ArgumentOutOfBoundException {
        if (a > b) {
            throw new ArgumentOutOfBoundException("Lower bound of line segment is more than upper");
        }
        this.a = a;
        this.b = b;
    }
    public double calculate(IRealFunction f) throws ArgumentOutOfBoundException, MathDividingException {
        if (a < f.getLowerBound() || b > f.getUpperBound()) {
            throw new ArgumentOutOfBoundException("[a, b] is going out of bounds of function");
        }
        double res = 0, h = (b - a) / FRAGMENTATION;            //h - шаг (ширина прямоугольника), res - значение интеграла
        for (double x = a + h * 0.5; x < b; x = x + h) {
            res = res + f.calculate(x) * h;
        }
        return res;
    }
}
