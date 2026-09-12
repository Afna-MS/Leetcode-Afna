// Last updated: 12/09/2026, 16:00:45
1class Solution {
2    public int hammingDistance(int x, int y) {
3        return Integer.bitCount(x ^ y);
4    }
5}
6