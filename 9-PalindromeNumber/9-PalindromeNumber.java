// Last updated: 11/08/2026, 16:16:47
class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int n=x;
        if(x<0) return false;
        while(x!=0){
            int d=x%10;
            r=r*10+d;
            x/=10;
        }
        if(r==n){
            return true;
        }
        return false;
    }
}