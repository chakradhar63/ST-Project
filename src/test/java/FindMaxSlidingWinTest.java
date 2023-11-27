package org.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class FindMaxSlidingWinTest {

    @Test
    public void testMax() {
        FindMaxSlidingWin test = new FindMaxSlidingWin();

        // Test 1
        int[] nums1 = {1,3,-1,-3,5,3,6,7};
        int k1 = 3;
        int[] ans1 = {3,3,5,5,6,7};
        assertArrayEquals(ans1, test.maxSlidingWindow(nums1, k1));

        // Test 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] ans2 = {1};
        assertArrayEquals(ans2, test.maxSlidingWindow(nums2, k2));

        // Test 3
        int[] nums3 = {1,-1};
        int k3 = 1;
        int[] ans3 = {1, -1};
        assertArrayEquals(ans3, test.maxSlidingWindow(nums3, k3));

        // Test 4
        int[] nums4 = {9,11};
        int k4 = 2;
        int[] ans4 = {11};
        assertArrayEquals(ans4, test.maxSlidingWindow(nums4, k4));

        // Test 5
        int[] nums5 = {4,-2};
        int k5 = 2;
        int[] ans5 = {4};
        assertArrayEquals(ans5, test.maxSlidingWindow(nums5, k5));
    }
}
