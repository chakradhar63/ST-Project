package org.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MissRepeatNumsTest {
    @Test
    public void TestMissRepeatNums() {
        MissRepeatNums test  = new MissRepeatNums();

        // Test 1
        int[] arr1 = {4, 3, 2, 7, 8, 2, 1, 5};
        int[] ans1 = {2, 6};
        assertArrayEquals(ans1, test.findMissingRepeatingNumbers(arr1));

        // Test 2
        int[] arr2 = {3, 1, 3, 4, 2};
        int[] ans2 = {3, 5};
        assertArrayEquals(ans2, test.findMissingRepeatingNumbers(arr2));

        // Test 3
        int[] arr3 = {1, 2, 2, 4, 5};
        int[] ans3 = {2, 3};
        assertArrayEquals(ans3, test.findMissingRepeatingNumbers(arr3));

        // Test 4
        int[] arr4 = {5, 2, 3, 4, 3};
        int[] ans4 = {3, 1};
        assertArrayEquals(ans4, test.findMissingRepeatingNumbers(arr4));

    }
}
