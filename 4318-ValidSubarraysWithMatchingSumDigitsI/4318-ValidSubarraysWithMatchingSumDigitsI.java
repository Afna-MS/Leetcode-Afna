// Last updated: 11/08/2026, 15:59:33
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            long s=0;
            for(int j=i;j<n;j++){
                s += nums[j];
                if(isValid(s,x)){
                    c++;
                }
            }
        }
        return c;
    }
    private boolean isValid(long s,int x){
        int ld=(int)(s%10);
        long t=s;
        while(t>=10){
            t/=10;
        }
        int fd=(int)t;
        return fd==x&&ld==x;
    }
}