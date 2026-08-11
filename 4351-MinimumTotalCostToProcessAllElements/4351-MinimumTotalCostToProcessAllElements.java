// Last updated: 11/08/2026, 15:58:53
class Solution {
    public int minimumCost(int[] nums, int k) {
       final int mod=1_000_000_007;
        final long INV_2=500_000_004L;
        long r=k;
        long op=0;
        long c=0;
        for(int x:nums){
            if(r<x){
                long need=x-r;
                long add=(need+k-1)/k;
                long f=(op+1)%mod;
                long l=(op+add)%mod;
                long s=(f+l)%mod;
                long ct=add%mod;
                long p=(((s*ct)%mod)*INV_2)%mod;
                c=(c+p)%mod;
                op += add;
                r += add*(long)k;
            }
            r -= x;
        }
        return (int)(c%mod);
    }
}