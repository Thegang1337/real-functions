package interfaces;

import exceptions.ArgumentOutOfBoundException;
import exceptions.MathDividingException;

public interface IFunctional<T> {
    double calculate(T f) throws ArgumentOutOfBoundException, MathDividingException;
}
