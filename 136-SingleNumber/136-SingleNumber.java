// Last updated: 11/08/2026, 16:14:23
class Solution {
    public int singleNumber(int[] nums) {
        int i,x=0;
        for(i=0;i<nums.length;i++)
        x=x^nums[i];
        return x;
        
    }
}