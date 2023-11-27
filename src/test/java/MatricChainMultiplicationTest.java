package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatricChainMultiplicationTest
{
    @Test
    public void testmatrixMultiplication()
    {
        MatricChainMultiplication mcm = new MatricChainMultiplication();

        int[] arr1 = {1, 2, 3, 4};
        int result1 = mcm.matrixMultiplication(arr1, arr1.length);
        assertEquals(18, result1);

        int[] arr2 = {41,23,42,27,35,46,43,49,34,31,23,34,20,20,32,42,40,27,35,46};
        int result2 = mcm.matrixMultiplication(arr2, arr2.length);
        assertEquals(454562, result2);
    }
}
