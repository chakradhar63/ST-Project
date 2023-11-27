package org.example;
import java.util.Arrays;

public class MaxPathSumInMatrix
{
    public static int getMaxPathSum(int[][] matrix)
    {

        int maxVal = Integer.MIN_VALUE;
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int[][] dp = new int[rowSize][colSize];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));

        for (int i = 0; i< matrix[0].length; i++) {
            maxVal = Math.max(maxVal, maxSum(rowSize-1, i, matrix, rowSize, colSize, dp));
        }
        return maxVal;
    }
    private static int maxSum(int row, int col, int[][] matrix, int rowSize, int colSize, int[][] dp)
    {
        if (row == 0)
        {
            return matrix[0][col];
        }
        if(dp[row][col] != -1)
        {
            return dp[row][col];
        }
        int[] rowDirection = {-1, -1, -1};
        int[] colDirection = {-1, 0, 1};
        dp[row][col] = Integer.MIN_VALUE;
        for (int index = 0; index < rowDirection.length; index++)
        {
            if (row+rowDirection[index] >= 0 && col+colDirection[index] >= 0 && col+colDirection[index] < colSize)
                dp[row][col] = Math.max(dp[row][col], maxSum(row+rowDirection[index], col+colDirection[index], matrix, rowSize, colSize, dp));
        }
        dp[row][col] += matrix[row][col];
        return dp[row][col];
    }
}
