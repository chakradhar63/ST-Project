package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindLargestRectAreaTest {

    @Test
    public void testLargestRectangleArea() {
        FindLargestRectArea test = new FindLargestRectArea();
        // Test 1
        int[] height1 = {2, 1, 5, 6, 2, 3};
        int ans1 = 10;
        assertEquals(ans1, test.largestRectangleArea(height1));

        // Test 2
        int[] height2 = {2, 4};
        int ans2 = 4;
        assertEquals(ans2, test.largestRectangleArea(height2));

        // Test 3
        int[] height3 = {1, 1};
        int ans3 = 2;
        assertEquals(ans3, test.largestRectangleArea(height3));

        // Test 4
        int[] height4 = {1};
        int ans4 = 1;
        assertEquals(ans4, test.largestRectangleArea(height4));

        // Test 5
        int[] height5 = {};
        int ans5 = 0;
        assertEquals(ans5, test.largestRectangleArea(height5));

        // Test 6
        int[] height6 = {2, 1, 2};
        int ans6 = 3;
        assertEquals(ans6, test.largestRectangleArea(height6));

        // Test 7
        int[] height7 = {2, 2, 2, 2};
        int ans7 = 8;
        assertEquals(ans7, test.largestRectangleArea(height7));
    }
}
