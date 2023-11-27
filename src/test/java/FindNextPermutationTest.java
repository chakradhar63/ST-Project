package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;


public class FindNextPermutationTest {
    @Test
    public void NextPermutation() {
        FindNextPermutation test  = new FindNextPermutation();

        // Test 1
        List<Integer> input1 = new ArrayList<>(Arrays.asList(1, 1, 1));
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 1, 1));
        assertEquals(expected1, test.nextPermutation(input1));

        // Test 2
        List<Integer> input2 = new ArrayList<>(Arrays.asList(1, 3, 2));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(2, 1, 3));
        assertEquals(expected2, test.nextPermutation(input2));

        // Test 3
        List<Integer> input3 = new ArrayList<>(Arrays.asList(4, 5, 1 ,3, 2));
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(4, 5, 2, 1, 3));
        assertEquals(expected3, test.nextPermutation(input3));

        // Test 4
        List<Integer> input4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4));
        assertEquals(expected4, test.nextPermutation(input4));

        // Test 5
        List<Integer> input5 = new ArrayList<>(Arrays.asList(1));
        List<Integer> expected5 = new ArrayList<>(Arrays.asList(1));
        assertEquals(expected5, test.nextPermutation(input5));

        // Test 6
        List<Integer> input6 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected6 = new ArrayList<>(Arrays.asList(1, 3, 2));
        assertEquals(expected6, test.nextPermutation(input6));
    }
}
