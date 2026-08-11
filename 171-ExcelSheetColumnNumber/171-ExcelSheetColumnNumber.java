// Last updated: 11/08/2026, 16:13:49
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int currentVal = c - 'A' + 1;
            result = result * 26 + currentVal;
        }
        return result;
    }
}