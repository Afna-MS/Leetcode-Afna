// Last updated: 11/08/2026, 16:00:10
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) freq[num]++;
        int max = 0;
        for (int f : freq) if (f > max) max = f;
        int sum = 0;
        for (int f : freq) if (f == max) sum += f;
        return sum;
    }
}
