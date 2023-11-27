package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.awt.event.ItemEvent;

public class RainTrappingTest {

    @Test
    public void TestRainTrapping() {
        RainTrapping test = new RainTrapping();
        // Test 1
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected1 = 6;
        assertEquals(expected1, test.trap(height1));

        // Test 2
        int[] height2 = {4,2,0,3,2,5};
        int expected2 = 9;
        assertEquals(expected2, test.trap(height2));

        // Test 3
        int[] height3 = {5, 1, 14, 12, 6, 4, 4, 2, 12, 3, 5};
        int expected3 = 38;
        assertEquals(expected3, test.trap(height3));

        // Test 4
        int[] height4 = {6, 7, 2, 1, 14, 12, 8, 4, 9, 12};
        int expected4 = 26;
        assertEquals(expected4, test.trap(height4));

        // Test 5
        int[] height5 = {8, 6, 2, 11, 1, 11, 11, 2, 7, 2};
        int expected5 = 23;
        assertEquals(expected5, test.trap(height5));

        // Test 6
        int[] height6 = {5, 10, 10, 2, 3, 4, 2};
        int expected6 = 3;
        assertEquals(expected6, test.trap(height6));

        // Test 7
        int[] height7 = {11, 13, 2, 3, 13, 2, 11, 13, 10, 1};
        int expected7 = 34;
        assertEquals(expected7, test.trap(height7));
    }
}
