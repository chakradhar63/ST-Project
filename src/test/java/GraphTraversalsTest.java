package org.example;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class GraphTraversalsTest{

    @Test
    public void testPerformTraversals() {
        GraphTraversals Gt = new GraphTraversals();

        List<int[]> edges = Arrays.asList(new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 3}, new int[]{1, 4}, new int[]{2, 5});
        List<Integer> expectedBFS = Arrays.asList(0, 1, 2, 3, 4, 5);
        List<Integer> expectedDFS = Arrays.asList(0, 1, 3, 4, 2, 5);
        List<Integer> expectedTopologicalSort = Arrays.asList(0, 2, 5, 1, 4, 3);
        List<List<Integer>> result = Gt.performTraversals(edges, 6, 0);
        List<Integer> actualBFS = result.get(0);
        List<Integer> actualDFS = result.get(1);
        List<Integer> actualTopologicalSort = result.get(2);

        assertArrayEquals(expectedBFS.toArray(), actualBFS.toArray());
        assertArrayEquals(expectedDFS.toArray(), actualDFS.toArray());
        assertArrayEquals(expectedTopologicalSort.toArray(), actualTopologicalSort.toArray());

        List<int[]> edges2 = Arrays.asList(new int[]{0, 1}, new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 4});
        List<Integer> expectedBFS2 = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> expectedDFS2 = Arrays.asList(0, 1, 2, 4, 3);
        List<Integer> expectedTopologicalSort2 = Arrays.asList(0, 1, 3, 2, 4);
        List<List<Integer>> result2 = Gt.performTraversals(edges2, 5, 0);
        List<Integer> actualBFS2 = result2.get(0);
        List<Integer> actualDFS2 = result2.get(1);
        List<Integer> actualTopologicalSort2 = result2.get(2);

        assertArrayEquals(expectedBFS2.toArray(), actualBFS2.toArray());
        assertArrayEquals(expectedDFS2.toArray(), actualDFS2.toArray());
        assertArrayEquals(expectedTopologicalSort2.toArray(), actualTopologicalSort2.toArray());

    }
}