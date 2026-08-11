// Last updated: 11/08/2026, 16:02:34
class Solution {
    public int tribonacci(int n) {
       if(n==0) return 0;
       if(n==1||n==2) return 1;
       int n1=0,n2=1,n3=1;
       for(int i=3;i<=n;i++){
           int ans=n1+n2+n3;
           n1=n2;
           n2=n3;
           n3=ans;
       }
       return n3; 
    }
}