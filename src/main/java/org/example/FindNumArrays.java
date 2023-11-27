package org.example;
import java.util.*;
public class FindNumArrays {
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            int x = xr ^ k;
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            }
            else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }
}
