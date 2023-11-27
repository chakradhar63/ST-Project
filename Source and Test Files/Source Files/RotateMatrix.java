package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m)
    {
        int k=0;
        for(int l=0;l<(m/2);l++)
        {
            int temp = mat.get(k).get(k);
            int i=k,j=k+1;
            while(j <= m-(k+1))
            {
                int hi = mat.get(i).get(j);
                mat.get(i).set(j,temp);
                temp = hi;
                j++;
            }
            j=m-(k+1);
            i=k+1;
            while(i <= n-(k+1))
            {
                int hi = mat.get(i).get(j);
                mat.get(i).set(j,temp);
                temp = hi;
                i++;
            }
            i=n-(k+1);
            j=m-(k+2);
            while(j >= k)
            {
                int hi = mat.get(i).get(j);
                mat.get(i).set(j,temp);
                temp = hi;
                j--;
            }
            j=k;
            i=n-(k+2);
            while(i >= k)
            {
                int hi = mat.get(i).get(j);
                mat.get(i).set(j,temp);
                temp = hi;
                i--;

            }
            k++;
        }
    }
}
