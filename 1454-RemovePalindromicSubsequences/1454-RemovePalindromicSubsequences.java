// Last updated: 11/08/2026, 16:02:10
class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0;
        if (isPalindrome(s)) return 1;
        return 2;
    }
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
