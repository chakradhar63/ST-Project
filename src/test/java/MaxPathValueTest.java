package org.example;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
public class MaxPathValueTest
{
    @Test
    public void testgetMaxPathSum()
    {
        MaxPathValue mpv = new MaxPathValue();
        int n1 = 4;
        int m1 = 4;
        ArrayList<ArrayList<Integer>> edges1 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(2, 3)),
                new ArrayList<>(Arrays.asList(3, 4)),
                new ArrayList<>(Arrays.asList(4, 1))
        ));
        String values1 = "apry";
        int result1 = mpv.maxPathValue(n1, m1, edges1, values1);
        assertEquals(-1, result1);
        int n2 = 8;
        int m2 = 11;
        ArrayList<ArrayList<Integer>> edges2 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(2, 5)),
                new ArrayList<>(Arrays.asList(6, 3)),
                new ArrayList<>(Arrays.asList(4, 5)),
                new ArrayList<>(Arrays.asList(7, 6)),
                new ArrayList<>(Arrays.asList(8, 4)),
                new ArrayList<>(Arrays.asList(2, 8)),
                new ArrayList<>(Arrays.asList(7, 8)),
                new ArrayList<>(Arrays.asList(1, 7)),
                new ArrayList<>(Arrays.asList(3, 4)),
                new ArrayList<>(Arrays.asList(1, 3))
        ));
        String values2 = "nndnnsnn";
        int result2 = mpv.maxPathValue(n2, m2, edges2, values2);
        assertEquals(5, result2);
    }
}
