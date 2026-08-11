// Last updated: 11/08/2026, 15:58:27
class Solution {
    public int maxDigitRange(int[] nums) {
        int max=-1;
        int s=0;
        for(int num:nums){
            int r=digitRange(num);
            if(r>max){
                max=r;
            }
        }
        for(int num:nums){
            if(digitRange(num)==max){
                 s+=num;
            }
        }
        return s;
    }
    private int digitRange(int num){
        if(num==0) return 0;
        int mind=9;
        int maxd=0;
        while(num>0){
            int d=num%10;
            mind=Math.min(mind,d);
            maxd=Math.max(maxd,d);
            num /= 10;
        }
        return maxd-mind;
    }
}