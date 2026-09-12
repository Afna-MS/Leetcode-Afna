// Last updated: 12/09/2026, 15:55:26
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n+1];
4        for (int i = 1; i <= n; i++)
5            ans[i] = ans[i >> 1] + (i & 1);
6        return ans;
7    }
8}
9