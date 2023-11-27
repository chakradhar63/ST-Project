package org.example;
import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaximumXorTest {
    @Test
    public void testMaximumxor()
    {
        MaximumXor mx = new MaximumXor();

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(0,0,0,0,0));
        ArrayList<ArrayList<Integer>> queries1 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 0)),
                new ArrayList<>(Arrays.asList(1, 1))
        ));
        assertEquals(new ArrayList<>(Arrays.asList(1, 1)), mx.maxXorQueries(arr1, queries1));

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 6, 3, 5, 2, 4));
        ArrayList<ArrayList<Integer>> queries2 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(6, 3)),
                new ArrayList<>(Arrays.asList(8, 1)),
                new ArrayList<>(Arrays.asList(12, 4))
        ));
        assertEquals(new ArrayList<>(Arrays.asList(5, -1, 15)), mx.maxXorQueries(arr2, queries2));

    }

}
