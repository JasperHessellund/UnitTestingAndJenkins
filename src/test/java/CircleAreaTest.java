
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class CircleAreaTest {

    private double input;
    private double expectedResult;
    private CircleArea circleArea;

    @Before
    public void initialize() {
        circleArea = new CircleArea();
    }

    public CircleAreaTest(double input, double expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new Object[][] {
                {5.0, 78.54},
                {7.0, 153.94},
                {23.5, 1734.94},
        });

    }

    @Test
    public void computeCircleArea() {
        assertEquals(expectedResult, circleArea.computeCircleArea(input));
    }
}