// Last updated: 11/08/2026, 16:16:19
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1;
         while (l <= h) {
            int mid = l + (h - l) / 2; 
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else{
                h = mid - 1;
            }
        }return l;
    }
}