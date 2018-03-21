package functions;

import exceptions.ArgumentOutOfBoundException;
import exceptions.MathDividingException;
import interfaces.IRealFunction;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HyperbolaTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][] {
                { -50, 1.27 },
                { 0, 0.75 }
        };
    }
    @DataProvider
    public static Object[][] dataOutOfBound() {
        return new Object[][] {
                { -101, -499 },
                { 101, 511 }
        };

    }
    @DataProvider
    public static Object[][] dataDividing() {
        return new Object[][] {
                { -2, 987897 }
        };

    }

    @Test(dataProvider = "data")
    public void testCalculate(double input, double expectedResult) throws Exception {
        IRealFunction hyperbola = new Hyperbola(
                -100,
                100,
                5,
                6,
                4,
                8
        );

        Assert.assertEquals(expectedResult, hyperbola.calculate(input), 0.01);
    }

    @Test(dataProvider = "dataOutOfBound", expectedExceptions = ArgumentOutOfBoundException.class)
    public void testArgumentOutOfBound(double input, double expectedResult) throws Exception {
        IRealFunction hyperbola = new Hyperbola(
                -100,
                100,
                5,
                6,
                4,
                8
        );

        Assert.assertEquals(expectedResult, hyperbola.calculate(input), 0.01);
    }

    @Test(dataProvider = "dataDividing", expectedExceptions = MathDividingException.class)
    public void testDividingByZero(double input, double expectedResult) throws Exception {
        IRealFunction hyperbola = new Hyperbola(
                -100,
                100,
                5,
                6,
                4,
                8
        );

        Assert.assertEquals(expectedResult, hyperbola.calculate(input), 0.01);
    }

}
