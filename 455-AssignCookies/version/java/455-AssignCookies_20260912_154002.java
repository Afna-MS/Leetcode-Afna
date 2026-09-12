// Last updated: 12/09/2026, 15:40:02
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int i = 0, j = 0;
6        while (i < g.length && j < s.length) {
7            if (s[j] >= g[i]) i++;
8            j++;
9        }
10        return i;
11    }
12}
13