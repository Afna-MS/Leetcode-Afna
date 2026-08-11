// Last updated: 11/08/2026, 16:03:19
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int n1=0,n2=1,ans;
        for(int i=2;i<=n;i++){
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        return n2;


        // return fib(n-1)+fib(n-2);time complexity

    }
}