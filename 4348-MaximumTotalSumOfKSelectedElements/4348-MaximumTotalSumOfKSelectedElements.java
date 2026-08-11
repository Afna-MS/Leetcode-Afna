// Last updated: 11/08/2026, 15:58:58
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long sum=0;
        int [] selected=new int[k];
        for(int i=0;i<k;i++)
            selected[i]=nums[n-1-i];
        Arrays.sort(selected);
        for(int i=k-1;i>=0;i--){
            long multiply=(long)selected[i]*mul;
            if(multiply > selected[i]){
                sum += multiply;
            }else{
                sum += selected[i];
            }
            mul--;
        }
        return sum;
    }
}