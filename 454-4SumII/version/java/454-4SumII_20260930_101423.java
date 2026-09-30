// Last updated: 30/09/2026, 10:14:23
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int a : nums1) {
5            for (int b : nums2) {
6                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
7            }
8        }
9        int ans = 0;
10        for (int c : nums3) {
11            for (int d : nums4) {
12                ans += map.getOrDefault(-(c + d), 0);
13            }
14        }
15        return ans;
16    }
17}