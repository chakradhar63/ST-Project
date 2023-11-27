package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class MatrixMedianTest
{
    @Test
    public void testgetmedian()
    {
        MatrixMedian mm = new MatrixMedian();
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(2, 6, 9)),
                new ArrayList<>(Arrays.asList(1, 5, 11)),
                new ArrayList<>(Arrays.asList(3, 7, 8))
        ));
        int result1 = mm.getMedian(matrix1);
        assertEquals(6, result1);
    }
}
