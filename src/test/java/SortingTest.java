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
    private boolean sortAscending;
    private int[] expectedResult;
    private Sorting sorting;
    @Before
    public void initialize() {
        sorting = new Sorting();
    }

    public SortingTest(int[] inputArray, boolean sortAscending, int[] expectedResult) {
        this.inputArray = inputArray;
        this.sortAscending = sortAscending;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new Object[][]{
                {new int[]{51, 50, 49, 4, 5500, 10000}, true, new int[]{}},//upper boundary value 50 returns empty array
                {new int[]{-1, -500, -1000, 1, 0, 3, 4, 5}, true, new int[]{}}, //lower boundary value 0 -||-
                {new int[]{2, 3, 1, 9, 8, 2}, true, new int[]{1, 2, 2, 3, 8, 9}},
                {new int[]{2, 3, 1, 9, 8, 2}, false, new int[]{9, 8, 3, 2, 2, 1}},

        });
    }

    @Test
    public void sort(){
        System.out.println("Parameterized sorting is: " + Arrays.toString(inputArray));
        assertArrayEquals(expectedResult, sorting.sort(inputArray, sortAscending));
    }
}