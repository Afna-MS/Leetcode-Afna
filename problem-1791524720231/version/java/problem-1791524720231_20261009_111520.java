// Last updated: 09/10/2026, 11:15:20
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        map.put(0, 1);
5
6        int sum = 0;
7        int ans = 0;
8
9        for (int num : nums) {
10            sum += num;
11            ans += map.getOrDefault(sum - k, 0);
12            map.put(sum, map.getOrDefault(sum, 0) + 1);
13        }
14
15        return ans;
16    }
17}