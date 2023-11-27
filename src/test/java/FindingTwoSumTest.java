package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindingTwoSumTest {
    @Test
    public void testTwoSum() {
        FindingTwoSum test  = new FindingTwoSum();

        // Test 1021
        int n1 = 6;
        int target1 = 6;
        int arr1[] = {4, 1, 2, 3, 1, 5};
        assertEquals("YES", test.twoSum(n1, arr1, target1));

        // Test 2
        int n2 = 1;
        int target2 = 2;
        int arr2[] = {3};
        assertEquals("NO", test.twoSum(n2, arr2, target2));

        // Test 3
        int n3 = 10;
        int target3 = 210;
        int arr3[] = {10, 321, 240, 560, 310, 120, 173, 740, 616, 560};
        assertEquals("NO", test.twoSum(n3, arr3, target3));

        // Test 4
        int n4 = 0;
        int target4 = 10;
        int arr4[] = {};
        assertEquals("NO", test.twoSum(n4, arr4, target4));

        int n5 = 5;
        int target5 = 9;
        int[] arr5 = {1, 2, 3, 4, 5};
        assertEquals("YES", test.twoSum(n5, arr5, target5));

        int n6 = 4;
        int target6 = 8;
        int[] arr6 = {1, 2, 3, 4};
        assertEquals("NO", test.twoSum(n6, arr6, target6));
    }
}
