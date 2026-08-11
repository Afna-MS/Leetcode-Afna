// Last updated: 11/08/2026, 16:11:53
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Set<Integer>s=new HashSet<>();
//         for(int ele:nums)
//         s.add(ele);
//         return s.size() != nums.length; 
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}