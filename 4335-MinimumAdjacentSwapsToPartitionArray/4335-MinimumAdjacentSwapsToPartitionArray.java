// Last updated: 11/08/2026, 15:59:20
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long t=0;
        long mod=1_000_000_007;
        long c0=0;
        long c1=0;
        long c2=0;
        for(int num:nums){
            if(num<a){
                t=(t+c1+c2)%mod;
                c0++;
            }
            else if(num>=a && num<=b){
                t=(t+c2)%mod;
                c1++;
            }else{
                c2++;
            }
        }
        return (int)t;
    }
}