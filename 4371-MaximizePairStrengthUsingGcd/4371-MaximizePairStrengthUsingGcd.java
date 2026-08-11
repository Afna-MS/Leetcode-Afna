// Last updated: 11/08/2026, 15:58:33
class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long a=nums[i];
                long b=nums[j];
                long g=gcd(a,b);
                long s=(a*b)/(g*g);
                max=Math.max(max,s);
            }
        }
        return max;
    }
    public long gcd(long a,long b){
        while(b!=0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}