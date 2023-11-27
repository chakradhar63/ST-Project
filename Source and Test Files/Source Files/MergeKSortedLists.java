package org.example;
import java.util.*;
public class MergeKSortedLists
{
    public static class Pair implements Comparable<Pair>
    {
        int li;
        int di;
        int val;
        Pair(int li,int di,int val)
        {
            this.di=di;
            this.li=li;
            this.val=val;
        }
        public int compareTo(Pair o)
        {
            return this.val-o.val;
        }
    }
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
    {
        ArrayList<Integer>result=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for (int i = 0; i < kArrays.size(); i++)
        {
            Pair p=new Pair(i, 0, kArrays.get(i).get(0));
            pq.add(p);
        }
        while(!pq.isEmpty())
        {
            Pair p=pq.remove();
            result.add(p.val);
            p.di++;
            if(p.di<kArrays.get(p.li).size())
            {
                p.val=kArrays.get(p.li).get(p.di);
                pq.add(p);
            }
        }
        return result;
    }
}