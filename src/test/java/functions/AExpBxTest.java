package functions;

import exceptions.ArgumentOutOfBoundException;
import interfaces.IRealFunction;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AExpBxTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][] {
                { -50, 2.57E-130},
                { 0, 5},
        };

    }

    @DataProvider
    public static Object[][] dataExcept() {
        return new Object[][] {
                { -101, -499 },
                { 101, 511 },
        };

    }

    @Test(dataProvider = "data")
    public void testCalculate(double input, double expectedResult) throws Exception {
        IRealFunction aExpBx = new AExpBx(
                -100,
                100,
                5,
                6
        );
        Assert.assertEquals(expectedResult, aExpBx.calculate(input), 0.1);
    }
    @Test(dataProvider = "dataExcept", expectedExceptions = ArgumentOutOfBoundException.class)
    public void testArgumentOutOfBounds(double input, double expectedResult) throws Exception {
        IRealFunction aExpBx = new AExpBx(
                -100,
                100,
                5,
                6
        );
        Assert.assertEquals(expectedResult, aExpBx.calculate(input), 0.1);
    }

}
