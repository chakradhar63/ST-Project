package org.example;
import java.util.*;

public class SearchInRowColumnSortedMatrix
{
    static class Pair
    {
        int x;
        int y;
        public Pair(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    public static Pair Pairsearch(int[][] matrix, int x) {
        int r = matrix.length;
        int c = matrix[0].length;
        int i = 0;
        int j = c - 1;
        Pair p = new Pair(-1, -1);
        while (i < r && j >= 0)
        {
            if (matrix[i][j] == x)
            {
                p.x = i;
                p.y = j;
                return p;
            }
            else if (matrix[i][j] > x)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return p;
    }
}
