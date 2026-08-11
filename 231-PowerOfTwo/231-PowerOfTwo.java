// Last updated: 11/08/2026, 16:11:27
class Solution {
    public boolean isPowerOfTwo(int n) {
    //   if(n==1){
    //     return true;
    //   }
      if(n<1){
        return false;
      }
      while(n%2==0)
        n=n/2;
        if(n==1)
        return true;
        else
      return false;
    }
}