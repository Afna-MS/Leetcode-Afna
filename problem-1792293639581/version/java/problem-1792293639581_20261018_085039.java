// Last updated: 18/10/2026, 08:50:39
1class Solution {
2    public int minDeletions(int[] nums) {
3        int n=nums.length;
4        int c=0;
5        for(int i=1;i<n;i++){
6            if(nums[i]==nums[i-1]){
7                c++;
8            }
9        }
10        return c;
11    }
12}