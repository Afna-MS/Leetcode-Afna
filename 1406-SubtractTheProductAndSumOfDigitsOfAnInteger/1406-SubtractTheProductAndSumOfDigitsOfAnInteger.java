// Last updated: 11/08/2026, 16:02:15
class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0;
        while(n!=0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return(p-s);
    }
}