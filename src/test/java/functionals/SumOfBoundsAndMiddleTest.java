package functionals;

import exceptions.BoundsException;
import functions.AExpBx;
import functions.ASinBx;
import functions.Hyperbola;
import functions.StraightLine;
import interfaces.IRealFunction;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumOfBoundsAndMiddleTest {
    @DataProvider
    public static Object[][] data() throws BoundsException {
        return new Object[][] {
                { new Hyperbola(10, 12, 1, 2, 3, 4), 1.05 },
                { new AExpBx(10, 12, 1, 2), 30559200171.38 },
                { new ASinBx(10, 12, 1, 2), -0.001 },
                { new StraightLine(10, 12, 1, 2), 39 }
        };
    }

    @Test(dataProvider = "data")
    public void testCalculate(IRealFunction input, double expected) throws Exception {
        SumOfBoundsAndMiddle fi = new SumOfBoundsAndMiddle();
        Assert.assertEquals(expected, fi.calculate(input), 0.01);
    }

}
