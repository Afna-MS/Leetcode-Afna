// Last updated: 11/08/2026, 16:02:26
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] freq = new int[arr.length];
        int freqIndex = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                freq[freqIndex++] = count;
                count = 1;
            }
        }
        freq[freqIndex++] = count;

        boolean[] seen = new boolean[arr.length + 1];
        for (int i = 0; i < freqIndex; i++) {
            if (seen[freq[i]]) {
                return false;
            }
            seen[freq[i]] = true;
        }
        return true;
    }
}