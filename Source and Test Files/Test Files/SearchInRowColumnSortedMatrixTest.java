package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;
public class SearchInRowColumnSortedMatrixTest
{
    @Test
    public void testPairsearch()
    {
        SearchInRowColumnSortedMatrix srcsm = new SearchInRowColumnSortedMatrix();
        int[][] matrix1 = {
                {2, 3, 4},
                {6, 7, 8},
                {12, 13, 15}
        };
        int x1 = 7;
        SearchInRowColumnSortedMatrix.Pair result1 = srcsm.Pairsearch(matrix1, x1);
        assertEquals(1, result1.x);
        assertEquals(1, result1.y);


        int[][] matrix2 = {
                {2, 5, 8},
                {3, 6, 9},
                {4, 7, 16}
        };
        int x2 = 4;
        SearchInRowColumnSortedMatrix.Pair result2 = srcsm.Pairsearch(matrix2, x2);
        assertEquals(2, result2.x);
        assertEquals(0, result2.y);

        int[][] matrix3 = {
                {1, 3},
                {5, 6}
        };
        int x3 = 5;
        SearchInRowColumnSortedMatrix.Pair result3 = srcsm.Pairsearch(matrix3, x3);
        assertEquals(1, result3.x);
        assertEquals(0, result3.y);

        int[][] matrix4 = {
                {1, 3, 4},
                {6, 7, 8},
                {10, 12, 13}
        };
        int x4 = 12;
        SearchInRowColumnSortedMatrix.Pair result4 = srcsm.Pairsearch(matrix4, x4);
        assertEquals(2, result4.x);
        assertEquals(1, result4.y);

        int[][] matrix5 = {{3}};
        int x5 = 1000;
        SearchInRowColumnSortedMatrix.Pair result5 = srcsm.Pairsearch(matrix5, x5);
        assertEquals(-1, result5.x);
        assertEquals(-1, result5.y);
    }
}
