// Last updated: 11/08/2026, 15:58:48
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        int []d=new int[n];
        int h=0;
        for(int i=0;i<n;i++){
            h=Math.max(h,gd(i,parent,d));
        }
        long s=0;
        for(int i=0;i<n;i++){
            s += (long)nums[i]*(h-d[i]+1);
        }
        return s;
    }
    private int gd(int i,int []parent,int[]d){
        if(d[i]!=0){
            return d[i];
        }
        if(parent[i]==-1){
            return d[i]=1;
        }
        return d[i]=gd(parent[i],parent,d)+1;
    }
}