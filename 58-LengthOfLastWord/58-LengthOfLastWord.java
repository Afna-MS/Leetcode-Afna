// Last updated: 11/08/2026, 16:15:53
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int strLength = str.length;
        return str[strLength - 1].length();
    }
}