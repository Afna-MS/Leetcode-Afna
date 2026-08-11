// Last updated: 11/08/2026, 16:01:18
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, int[]> map = new HashMap<>();
        for (String w : words1) {
            map.putIfAbsent(w, new int[2]);
            map.get(w)[0]++; 
        }
        for (String w : words2) {
            map.putIfAbsent(w, new int[2]);
            map.get(w)[1]++; 
        }
        int count = 0;
        for (int[] freq : map.values()) {
            if (freq[0] == 1 && freq[1] == 1) count++;
        }
        return count;
    }
}
