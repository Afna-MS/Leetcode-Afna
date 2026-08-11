// Last updated: 11/08/2026, 16:13:54
class Solution {
    public int majorityElement(int[] nums) {
        int c=0,t=0,n=nums.length,i;
        for(i=0;i<n;i++){
            if(c==0)
            t=nums[i];
            if(t==nums[i])
            c++;
            else
            c--;
        }
        return t;
    }
}