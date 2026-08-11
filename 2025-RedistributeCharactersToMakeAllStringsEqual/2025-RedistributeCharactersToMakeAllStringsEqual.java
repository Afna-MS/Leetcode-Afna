// Last updated: 11/08/2026, 16:01:26
class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }
        int n = words.length;
        for (int freq : count) {
            if (freq % n != 0) return false;
        }
        return true;
    }
}
