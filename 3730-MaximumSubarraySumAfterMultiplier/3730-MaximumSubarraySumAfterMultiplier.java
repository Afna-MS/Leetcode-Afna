// Last updated: 11/08/2026, 15:59:50
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        return Math.max(solve(nums,k,true),solve(nums,k,false));
    }
    private long solve(int[]nums,int k,boolean isMultiply){
        int n=nums.length;
        long noOp=Long.MIN_VALUE/2;
        long inOp=Long.MIN_VALUE/2;
        long doneOp=Long.MIN_VALUE/2;
        long maxOpf=Long.MIN_VALUE/2;
        long ans=Long.MIN_VALUE;
        for(int x:nums){
            long t=isMultiply?(long)x*k:(long)(x/k);
            long newDone=Math.max(doneOp,inOp)+x;
            if(maxOpf !=Long.MIN_VALUE/2){
                newDone=Math.max(newDone,(long)x);
            }
            long newIn=Math.max(t,Math.max(inOp,noOp)+t);
            long newNo=Math.max((long)x,noOp+x);
            noOp=newNo;
            inOp=newIn;
            doneOp=newDone;
            maxOpf=Math.max(maxOpf,t);
            ans=Math.max(ans,Math.max(noOp,Math.max(inOp,doneOp)));
        }
        return Math.max(ans,maxOpf);
    }
}