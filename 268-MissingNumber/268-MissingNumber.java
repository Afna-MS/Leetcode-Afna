// Last updated: 11/08/2026, 16:10:44
class Solution {
    public int missingNumber(int[] nums) {
        int i,n=nums.length,x=0,sum=0;
        for(i=0;i<n;i++){
        sum += nums[i];
        }
        x=n*(n+1)/2;
        return(x-sum);
    }
}