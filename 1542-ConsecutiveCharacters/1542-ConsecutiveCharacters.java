// Last updated: 11/08/2026, 16:02:02
class Solution {
    public int maxPower(String s) {
        int maxLen = 1, currLen = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }
        return maxLen;
    }
}
