// Last updated: 11/08/2026, 16:06:07
class Solution {
    public boolean validPalindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1, false);
    }
    
    private boolean checkPalindrome(String s, int left, int right, boolean deleted) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (deleted) return false; 
                return checkPalindrome(s, left + 1, right, true) ||
                       checkPalindrome(s, left, right - 1, true);
            }
            left++;
            right--;
        }
        return true;
    }
}
 