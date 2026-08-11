// Last updated: 11/08/2026, 16:00:13
import java.util.HashSet;

class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) break;
            sum += nums[i];
        }

        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}
