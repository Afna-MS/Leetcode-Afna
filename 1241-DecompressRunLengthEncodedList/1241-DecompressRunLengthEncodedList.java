// Last updated: 11/08/2026, 16:02:30
import java.util.*;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            
            for (int j = 0; j < freq; j++) {
                result.add(val);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
