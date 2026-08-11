// Last updated: 11/08/2026, 16:01:58
class Solution {
    public int[] runningSum(int[] nums) {
        int i,n=nums.length;
        for(i=1;i<n;i++){
             nums[i]=nums[i]+nums[i-1];
        }
        return nums;

    }
}