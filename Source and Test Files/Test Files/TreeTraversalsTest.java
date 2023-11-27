package org.example;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class TreeTraversalsTest
{
    @Test
    public void testperformTraversals()
    {
        TreeTraversals tt = new TreeTraversals();
        List<int[]> edges = Arrays.asList(new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 3}, new int[]{1, 4});
        int vertices = 5;
        int root = 0;

        // Perform traversals
        List<List<Integer>> traversals = tt.performTraversals(edges, vertices, root);

        // Expected results for the given tree
        List<Integer> expectedInorder = Arrays.asList(3, 1, 4, 0, 2);
        List<Integer> expectedPreorder = Arrays.asList(0, 1, 3, 4, 2);
        List<Integer> expectedPostorder = Arrays.asList(3, 4, 1, 2, 0);

        // Assert the results
        assertEquals(expectedInorder, traversals.get(0));
        assertEquals(expectedPreorder, traversals.get(1));
        assertEquals(expectedPostorder, traversals.get(2));
    }

    @Test
    public void testEmptyTree()
    {
        TreeTraversals tt = new TreeTraversals();
        List<int[]> edges = Collections.emptyList();
        int vertices = 0;
        int root = -1; // No root as the tree is empty

        // Perform traversals on an empty tree
        List<List<Integer>> traversals = tt.performTraversals(edges, vertices, root);

        // Expected results for an empty tree
        List<Integer> expectedInorder = Collections.emptyList();
        List<Integer> expectedPreorder = Collections.emptyList();
        List<Integer> expectedPostorder = Collections.emptyList();

        // Assert the results
        assertEquals(expectedInorder, traversals.get(0));
        assertEquals(expectedPreorder, traversals.get(1));
        assertEquals(expectedPostorder, traversals.get(2));
    }

    @Test
    public void testSkewedTree()
    {
        TreeTraversals tt = new TreeTraversals();
        List<int[]> edges = Arrays.asList(new int[]{0, 1}, new int[]{1, 2}, new int[]{2, 3}, new int[]{3, 4});
        int vertices = 5;
        int root = 0;

        // Perform traversals on a skewed tree
        List<List<Integer>> traversals = tt.performTraversals(edges, vertices, root);

        // Expected results for a skewed tree
        List<Integer> expectedInorder = Arrays.asList(4, 3, 2, 1, 0);
        List<Integer> expectedPreorder = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> expectedPostorder = Arrays.asList(4, 3, 2, 1, 0);

        // Assert the results
        assertEquals(expectedInorder, traversals.get(0));
        assertEquals(expectedPreorder, traversals.get(1));
        assertEquals(expectedPostorder, traversals.get(2));
    }
}
