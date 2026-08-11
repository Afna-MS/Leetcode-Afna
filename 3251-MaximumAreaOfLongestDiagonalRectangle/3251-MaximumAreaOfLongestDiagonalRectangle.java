// Last updated: 11/08/2026, 16:00:08
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxD=0;
        int maxA=0;
        for(int rect[]:dimensions){
            int l=rect[0];
            int w=rect[1];
            int d=l*l+w*w;
            int a=l*w;
            if(d>maxD||d==maxD && a>maxA){
                maxD=d;
                maxA=a;
            }
        }
        return maxA;
    }
}