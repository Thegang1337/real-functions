package interfaces;

import exceptions.ArgumentOutOfBoundException;
import exceptions.MathDividingException;

public interface IRealFunction {
    double getLowerBound();
    double getUpperBound();
    double calculate(double x) throws ArgumentOutOfBoundException, MathDividingException;

}
//Разработать интерфейс для понятия «функция одного вещественного аргумента,
//определенная на отрезке [a; b]». Интерфейс должен содержать метод вычисления
//        значения функции при заданном аргументе и методы получения границ отрезка.
