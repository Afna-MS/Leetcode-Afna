// Last updated: 10/10/2026, 21:02:13
1class Solution {
2    public int[] maxProductPair(int[] nums, int t) {
3        long mp=Long.MIN_VALUE;
4        int []r={-1,-1};
5        for(int i=0;i<nums.length;i++){
6            for(int j=0;j<nums.length;j++){
7                if( i!=j && nums[i]+nums[j]==t && nums[i]>nums[j]){
8                    long p=(long) nums[i]*nums[j];
9                    if(p>mp){
10                        mp=p;
11                        r[0]=i;
12                        r[1]=j;
13                    }
14                }
15            }
16        }
17        return r;
18    }
19}