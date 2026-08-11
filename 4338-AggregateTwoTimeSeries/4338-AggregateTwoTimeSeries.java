// Last updated: 11/08/2026, 15:59:17
import java.util.*;
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] s1, int[][] s2) {
        TreeSet<Integer>ts=new TreeSet<>();
        for(int[]p:s1){
            ts.add(p[0]);
        }
        for(int[]p:s2){
            ts.add(p[0]);
        }
        List<List<Integer>>res=new ArrayList<>();
        int i=0,j=0;
        int n1=s1.length,n2=s2.length;
        for(int t:ts){
            while(i<n1 && s1[i][0] <t){
                i++;
            }
            int val1=(i<n1)? s1[i][1]:0;
            while(j<n2 && s2[j][0]<t){
                j++;
            }
            int val2=(j<n2)?s2[j][1]:0;
            res.add(Arrays.asList(t,val1+val2));
        }
        return res;
    }
}