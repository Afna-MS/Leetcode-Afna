// Last updated: 27/09/2026, 09:21:19
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        HashMap<String,Integer>map=new HashMap<>();
4        int ans=0;
5        int max=0;
6        for(int i=0;i<nums.length-1;i++){
7            if(nums[i]==nums[i+1])
8            ans++;
9            else{
10            int a=Math.min(nums[i],nums[i+1]);
11            int b=Math.max(nums[i],nums[i+1]);
12            String key=a+"#"+b;
13            int c=map.getOrDefault(key,0)+1;
14            map.put(key,c);
15            max=Math.max(max,c);}
16        }
17        return ans+max;
18    }
19}