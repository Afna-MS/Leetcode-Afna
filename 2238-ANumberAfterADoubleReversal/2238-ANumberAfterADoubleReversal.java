// Last updated: 11/08/2026, 16:01:09
class Solution {
    public boolean isSameAfterReversals(int num) {
        int i,r1=0,r2=0;
        int temp =num;
        while(num!=0){
            int d = num%10;
            r1=r1*10+d;
            num=num/10;
        }
        while(r1!=0){
            int d =r1%10;
            r2=r2*10+d;
            r1=r1/10;

        }
        if(temp==r2){
            return(true);
        }return(false);
    }
}