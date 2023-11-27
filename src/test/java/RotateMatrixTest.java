package org.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrixTest {
    @Test
    public void testrotatematrix()
    {
        RotateMatrix Rm= new RotateMatrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        Rm.rotateMatrix(matrix, 3, 3);
        ArrayList<ArrayList<Integer>> expectedMatrix = new ArrayList<>();
        expectedMatrix.add(new ArrayList<>(Arrays.asList(4, 1, 2)));
        expectedMatrix.add(new ArrayList<>(Arrays.asList(7, 5, 3)));
        expectedMatrix.add(new ArrayList<>(Arrays.asList(8, 9, 6)));
        assertArrayEquals(expectedMatrix.toArray(), matrix.toArray());

        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(new ArrayList<>(Arrays.asList(4, 1)));
        matrix1.add(new ArrayList<>(Arrays.asList(5, 3)));
        Rm.rotateMatrix(matrix1, 2, 2);
        ArrayList<ArrayList<Integer>> expectedMatrix1 = new ArrayList<>();
        expectedMatrix1.add(new ArrayList<>(Arrays.asList(5, 4)));
        expectedMatrix1.add(new ArrayList<>(Arrays.asList(3, 1)));
        assertArrayEquals(expectedMatrix1.toArray(), matrix1.toArray());

    }
}
