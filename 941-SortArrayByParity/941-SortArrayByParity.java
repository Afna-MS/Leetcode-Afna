// Last updated: 11/08/2026, 16:03:47
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n==1) return nums;
        int j = 0;
        for(int i = 0; i < n ; i++){
            if( nums[i] % 2==0 ){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }
}