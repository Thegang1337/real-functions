package functionals;

import exceptions.ArgumentOutOfBoundException;
import exceptions.BoundsException;
import functions.AExpBx;
import functions.ASinBx;
import functions.Hyperbola;
import functions.StraightLine;
import interfaces.IRealFunction;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DefIntegralTest {
    @DataProvider
    public static Object[][] data() throws BoundsException {
        return new Object[][] {
                {
                    new Hyperbola(10, 12, 0, 1, 1, 0),
                    10, 12,
                    0.18232155679395462
                },
                {
                    new AExpBx(-100, 100, 1, 1),
                    0, 2,
                    6.38905609893065022
                },
                {
                    new ASinBx(-100, 100, 1, 1),
                    10, 12,
                    -1.68292548780894455
                },
                {
                    new StraightLine(-100, 100, 1, 0),
                    10, 12,
                    22
                }
        };
    }

    @Test(dataProvider = "data")
    public void testCalculate(IRealFunction inputFunction, double inputA, double inputB, double expected) throws Exception {
        DefiniteIntegral fi = new DefiniteIntegral(inputA, inputB);
        Assert.assertEquals(expected, fi.calculate(inputFunction), 1E-6);
    }

    @Test(expectedExceptions = ArgumentOutOfBoundException.class)
    public void testArgumentOutOfBound() throws Exception {
        IRealFunction inputFunction = new StraightLine(10, 12, 1, 2);
        double inputA = 8;
        double inputB = 12;
        double expected = 39;
        DefiniteIntegral fi = new DefiniteIntegral(inputA, inputB);
        Assert.assertEquals(expected, fi.calculate(inputFunction), 1E-6);
    }

}
