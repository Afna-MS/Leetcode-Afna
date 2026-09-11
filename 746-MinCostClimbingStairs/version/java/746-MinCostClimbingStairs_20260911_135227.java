// Last updated: 11/09/2026, 13:52:27
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int a = 0, b = 0; 
4        for (int i = 2; i <= cost.length; i++) {
5            int c = Math.min(a + cost[i-2], b + cost[i-1]);
6            a = b;
7            b = c;
8        }
9        return b;
10    }
11}
12