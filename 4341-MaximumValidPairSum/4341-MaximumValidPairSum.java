// Last updated: 11/08/2026, 15:59:09
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        int ans=Integer.MIN_VALUE;
        for(int j=k;j<n;j++){
            max=Math.max(max,nums[j-k]);
            ans=Math.max(ans,max+nums[j]);
        }
        return ans;
    }
}