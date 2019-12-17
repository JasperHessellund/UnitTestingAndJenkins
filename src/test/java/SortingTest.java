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
                {{51,2,3,4,5500, 10000},{}},//upper boundary value 50 returns empty array
                {{-1,-500,-1000, 1, 2, 3, 4, 5}, {}}, //lower boundary value 0 -||-
                {{2,3,1,9,8,2}, {1,2,2,3,8,9}}
        });




    }


    @Test
    public void sort() {
        System.out.println("Parameterized sorting is: " + Arrays.toString(inputArray));
        assertArrayEquals(expectedResult, sorting.sort(inputArray, true));
    }
}