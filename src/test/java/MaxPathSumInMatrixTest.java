package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxPathSumInMatrixTest
{
    @Test
    public void testgetMaxPathSum()
    {
        MaxPathSumInMatrix mps = new MaxPathSumInMatrix();
        int[][] matrix1={{1,0,0,0,0}, {0,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,0}, {0,0,0,0,1}};
        assertEquals(5, mps.getMaxPathSum(matrix1));

        int[][] matrix2 = {{5}};
        assertEquals(5, mps.getMaxPathSum(matrix2));

        int[][] matrix3 = {{2}, {3}};
        assertEquals(5, mps.getMaxPathSum(matrix3));

        int[][] matrix4 = {{2, 3}};
        assertEquals(3, mps.getMaxPathSum(matrix4));
    }
}
