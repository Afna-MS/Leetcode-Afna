// Last updated: 30/09/2026, 08:57:31
1class Solution {
2    public int minimumPushes(String word) {
3        int[] count = new int[26];
4        for (char c : word.toCharArray()) {
5            count[c - 'a']++;
6        }
7        Arrays.sort(count);
8        int ans = 0;
9        for (int i = 25, j = 0; i >= 0; i--, j++) {
10            ans += count[i] * (j / 8 + 1);
11        }
12        return ans;
13    }
14}