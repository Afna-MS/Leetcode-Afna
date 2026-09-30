// Last updated: 30/09/2026, 09:47:51
1class Solution {
2    public int sumDistance(int[] nums, String s, int d) {
3        int n = nums.length;
4        long mod = 1_000_000_007L;
5        long[] pos = new long[n];
6
7        for (int i = 0; i < n; i++) {
8            pos[i] = s.charAt(i) == 'L' ? nums[i] - (long)d : nums[i] + (long)d;
9        }
10
11        Arrays.sort(pos);
12
13        long ans = 0;
14        long prefix = 0;
15
16        for (int i = 0; i < n; i++) {
17            ans = (ans + i * pos[i] - prefix) % mod;
18            prefix += pos[i];
19        }
20
21        return (int)((ans + mod) % mod);
22    }
23}