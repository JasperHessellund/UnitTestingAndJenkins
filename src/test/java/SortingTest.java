import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)
public class SortingTest {

    private int[] inputArray;
    private int[] expectedResult;
    private Sorting sorting;
    @Before
    public void initialize() {
        sorting = new Sorting();
    }

    public SortingTest(int[] inputArray, int[] expectedResult) {
        this.inputArray = inputArray;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection sorter() {

        return Arrays.asList(new int[][][] {
                {{51,2,3,4,5},{2,3,4,5,51}} //boundary value 50
        });




    }


    @Test
    public void sort() {
        System.out.println("Parameterized sorting is: " + Arrays.toString(inputArray));
        assertArrayEquals(expectedResult, sorting.sort(inputArray, true));
    }
}