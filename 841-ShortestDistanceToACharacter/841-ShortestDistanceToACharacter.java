// Last updated: 11/08/2026, 16:04:27
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        int prev = -n; 
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) prev = i;
            res[i] = i - prev;
        }
        prev = 2 * n; 
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) prev = i;
            res[i] = Math.min(res[i], prev - i);
        }
        
        return res;
    }
}
