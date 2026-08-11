// Last updated: 11/08/2026, 15:59:01
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        int[]l=new int[n];
        int r[]=new int[n];
        int tx=0;
        for(int i=0;i<n;i++){
            while(tx<m && t.charAt(tx)!=s.charAt(i)){
                tx++;
            }
            l[i]=tx;
            if(tx<m) tx++;
        }
        if(l[n-1]<m) return true;
        tx=m-1;
        for(int i=n-1;i>=0;i--){
            while(tx>=0 && t.charAt(tx)!=s.charAt(i)){
                tx--;
            }
            r[i]=tx;
            if(tx>=0) tx--;
        }
        for(int k=0;k<n;k++){
            int lv=(k>0)?l[k-1]:-1;
            int rv=(k<n-1)?r[k+1]:m;
            if(lv<m && rv>-1){
                if(rv-lv>1){
                    return true;
                }
            }
        }
        return false;
    }
}