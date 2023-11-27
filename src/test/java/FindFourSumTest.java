package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class FindFourSumTest {

    @Test
    public void FourSum() {
        FindFourSum test = new FindFourSum();
        // Test 1
        int[] arr1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        List<List<Integer>> ans1 = new ArrayList<>();
        ans1.add(Arrays.asList(-2, -1, 1, 2));
        ans1.add(Arrays.asList(-2, 0, 0, 2));
        ans1.add(Arrays.asList(-1, 0, 0, 1));
        assertEquals(ans1, test.fourSum(arr1, target1));

        // Test 2
        int[] arr2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        List<List<Integer>> ans2 = new ArrayList<>();
        ans2.add(Arrays.asList(2, 2, 2, 2));
        assertEquals(ans2, test.fourSum(arr2, target2));

        // Test 3
        int[] arr3 = {-1, 0, 1, 2, -1, -4};
        int target3 = -1;
        List<List<Integer>> ans3 = new ArrayList<>();
        ans3.add(Arrays.asList(-4, 0, 1, 2));
        ans3.add(Arrays.asList(-1, -1, 0, 1));
        assertEquals(ans3, test.fourSum(arr3, target3));

        // Test 4
        int[] arr4 = {1, 0, -1, 0, -2, 2};
        int target4 = 0;
        List<List<Integer>> ans4 = new ArrayList<>();
        ans4.add(Arrays.asList(-2, -1, 1, 2));
        ans4.add(Arrays.asList(-2, 0, 0, 2));
        ans4.add(Arrays.asList(-1, 0, 0, 1));
        assertEquals(ans4, test.fourSum(arr4, target4));

        // Test 5
        int[] arr5 = {2, 2, 2, 2, 2};
        int target5 = 8;
        List<List<Integer>> ans5 = new ArrayList<>();
        ans5.add(Arrays.asList(2, 2, 2, 2));
        assertEquals(ans5, test.fourSum(arr5, target5));

        // Test 6
        int[] arr6 = {-1, 0, 1, 2, -1, -4};
        int target6 = -1;
        List<List<Integer>> ans6 = new ArrayList<>();
        ans6.add(Arrays.asList(-4, 0, 1, 2));
        ans6.add(Arrays.asList(-1, -1, 0, 1));
        assertEquals(ans6, test.fourSum(arr6, target6));

        // Test 7
        int[] arr7 = {0, 0, 0, 0};
        int target7 = 0;
        List<List<Integer>> ans7 = new ArrayList<>();
        ans7.add(Arrays.asList(0, 0, 0, 0));
        assertEquals(ans7, test.fourSum(arr7, target7));
    }
}