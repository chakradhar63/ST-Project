package org.example;
import java.util.*;
public class MaxPathValue {
    public static void dfs(int visit[],ArrayList<ArrayList<Integer>> arr,int src,HashMap<Character,Integer> mp,int max[],String values){
        visit[src]=1;
        mp.put(values.charAt(src-1),mp.get(values.charAt(src-1))+1);

        for(Integer i:arr.get(src))
        {
            if(visit[i]==0)
            {
                dfs(visit, arr, i, mp, max, values);
            }
        }

        for(Map.Entry<Character,Integer> it:mp.entrySet()){
            max[0]=Math.max(it.getValue(), max[0]);
        }
        mp.put(values.charAt(src-1),mp.get(values.charAt(src-1))-1);
        visit[src]=0;


    }
    public static int maxPathValue(int n, int m, ArrayList<ArrayList<Integer>> edges, String values) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int indir[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            arr.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        for(int i=1;i<=n;i++){
            for(Integer j:arr.get(i)){
                indir[j]++;

            }
        }
        for(int i=1;i<=n;i++){
            if(indir[i]==0){
                q.add(i);
                ans.add(i);
            }
        }
        while(!q.isEmpty()){
            int t=q.peek();
            q.remove();
            for(Integer i:arr.get(t)){
                indir[i]--;
                if(indir[i]==0){
                    q.add(i);
                    ans.add(i);
                }
            }
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        if (ans.size()!=n) return -1;
        int visit[]=new int[n+1];
        int max[]={0};
        for(int j=0;j<n;j++){
            mp.put(values.charAt(j),0);
        }
        for(int i=0;i<n;i++){
            if(visit[ans.get(i)]==0){
                dfs(visit,arr,ans.get(i),mp,max,values);
            }
        }
        return max[0];
    }
}
