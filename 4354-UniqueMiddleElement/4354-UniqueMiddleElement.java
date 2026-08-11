// Last updated: 11/08/2026, 15:58:44
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int m=nums[nums.length/2];
        int c=0;
        for(int num:nums){
            if(num==m)
                c++;
        }
        return c==1;
    }
}