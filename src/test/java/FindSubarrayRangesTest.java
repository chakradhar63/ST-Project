package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindSubarrayRangesTest {

    @Test
    public void testSubArrayRanges() {
        // Test 1
        int[] nums1 = {1, 2, 3};
        long ans1 = 4;
        assertEquals(ans1, new FindSubarrayRanges().subArrayRanges(nums1));

        // Test 2
        int[] nums2 = {5, 4, 3, 2, 1};
        long ans2 = 20;
        assertEquals(ans2, new FindSubarrayRanges().subArrayRanges(nums2));

        // Test 3
        int[] nums3 = {1, 1, 1, 1};
        long ans3 = 0;
        assertEquals(ans3, new FindSubarrayRanges().subArrayRanges(nums3));

        // Test 4
        int[] nums4 = {2, 1, 2};
        long ans4 = 3;
        assertEquals(ans4, new FindSubarrayRanges().subArrayRanges(nums4));
    }
}
