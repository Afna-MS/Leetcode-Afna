// Last updated: 11/08/2026, 16:08:20
class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }
        if (capitalCount == n || capitalCount == 0) {
            return true;
        }
        if (capitalCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        return false;
    }
}