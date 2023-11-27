package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;
public class MergeKSortedListsTest
{
    @Test
    public void testmergeKSortedArrays()
    {
        MergeKSortedLists mksl = new MergeKSortedLists();
        ArrayList<ArrayList<Integer>> kArrays = new ArrayList<>();
        kArrays.add(new ArrayList<>(Arrays.asList(1, 5, 9)));
        kArrays.add(new ArrayList<>(Arrays.asList(45, 90)));
        kArrays.add(new ArrayList<>(Arrays.asList(2, 6, 78, 100, 234)));
        ArrayList<Integer> result = mksl.mergeKSortedArrays(kArrays, 3);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 5, 6, 9, 45, 78, 90, 100, 234));
        assertEquals(expected, result);
    }
}
