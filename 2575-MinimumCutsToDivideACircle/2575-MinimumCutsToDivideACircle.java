// Last updated: 11/08/2026, 16:00:57
class Solution {
    public int numberOfCuts(int n) {
       if(n==1)
        return 0;
       if(n%2==0){
         return (n/2);
       }
        return (n);
    }
}