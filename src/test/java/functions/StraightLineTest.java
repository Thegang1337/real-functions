package functions;

import exceptions.ArgumentOutOfBoundException;
import interfaces.IRealFunction;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StraightLineTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][] {
                { -50, -244 },
                { 0, 6 }
        };

    }

    @DataProvider
    public static Object[][] dataExcept() {
        return new Object[][] {
                { -101, -499 },
                { 101, 511 }
        };

    }

    @Test(dataProvider = "data")
    public void testCalculate(int input, int expectedResult) throws Exception {
        IRealFunction straightLine = new StraightLine(
                -100,
                100,
                5,
                6
        );

        Assert.assertEquals(expectedResult, straightLine.calculate(input), 0.000001);

    }

    @Test(dataProvider = "dataExcept", expectedExceptions = ArgumentOutOfBoundException.class)
    public void testArgumentOutOfBound(int input, int expectedResult) throws Exception {
        IRealFunction straightLine = new StraightLine(
                -100,
                100,
                5,
                6
        );

        Assert.assertEquals(expectedResult, straightLine.calculate(input), 0.000001);

    }

}
