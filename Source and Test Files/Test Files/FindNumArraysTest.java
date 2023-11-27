package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindNumArraysTest {
    @Test
    public void testCntSubarrays() {
        FindNumArrays test  = new FindNumArrays();

        // Test 1
        int k1 = 1;
        int arr1[] = {1, 1, 1, 1, 1, 1};
        assertEquals(12, test.subarraysWithXorK(arr1, k1));

        // Test 2
        int k2 = 5;
        int arr2[] = {1, 2, 3, 4, 5};
        assertEquals(2, test.subarraysWithXorK(arr2, k2));

        // Test 3
        int k3 = 7;
        int arr3[] = {1, 1, 4, 1, 5, 2};
        assertEquals(1, test.subarraysWithXorK(arr3, k3));

        // Test 4
        int k4 = 6;
        int arr4[] = {7, 3, 4, 2, 6, 5, 3};
        assertEquals(5, test.subarraysWithXorK(arr4, k4));

    }
}
