// Last updated: 11/08/2026, 16:00:05
class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq); 
        int pushes = 0;
        int pos = 0;
        for (int i = 25; i >= 0; i--) { 
            if (freq[i] == 0) continue;
            pushes += freq[i] * (pos / 8 + 1);
            pos++;
        }
        return pushes;
    }
}
