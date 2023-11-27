package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class binarySearchTest {
    @Test
    public void testbinarysearch() {
        binarySearch bs = new binarySearch();

        // Test 1
        int nums1[]={1, 2, 3, 4, 5};
        int target1=4;
        assertEquals(3, bs.search(nums1, target1));

        // Test 2
        int nums2[]={1, 2, 3, 4, 5};
        int target2=6;
        assertEquals(-1, bs.search(nums2, target2));

        // Test 3
        int nums3[]={};
        int target3=7;
        assertEquals(-1, bs.search(nums3, target3));

        // Test 4
        int nums4[]={8};
        int target4=8;
        assertEquals(0, bs.search(nums4, target4));

        // Test 5
        int nums5[]={8};
        int target5=3;
        assertEquals(-1, bs.search(nums5, target5));

        // Test 6
        int nums6[]={1, 2, 3, 4, 5};
        int target6=2;
        assertEquals(1, bs.search(nums6, target6));

        // Test 7
        int nums7[]={10,20,30,40,50};
        int target7=10;
        assertEquals(0, bs.search(nums7, target7));

        // Test 8
        int nums8[]={10,20,30,40,50};
        int target8=50;
        assertEquals(4, bs.search(nums8, target8));

        // Test 9
        int nums9[]={1, 2, 3, 4, 5};
        int target9=1;
        assertEquals(0, bs.search(nums9, target9));

        // Test 10
        int nums10[]={1, 2, 3, 4, 5};
        int target10=5;
        assertEquals(4, bs.search(nums10, target10));
    }
}
