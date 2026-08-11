// Last updated: 11/08/2026, 15:59:21
class Solution {
    public int minOperations(String s1, String s2) {
        int n=s1.length();
        int inf=(int)1e9;
        int d0=0;
        int d1=inf;
        for(int i=0;i<n;i++){
            int nd0=inf;
            int nd1=inf;
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            for(int carry=0;carry<=1;carry++){
                int cc=(carry==0)?d0:d1;
                if(cc>=inf) continue;
                char ac=(carry==1)?(c1=='0'?'1':'0'):c1;
                if(ac==c2){
                    nd0=Math.min(nd0,cc);
                }
                else if(ac=='0' && c2=='1'){
                    nd0=Math.min(nd0,cc+1);
                }
                if(i+1<n){
                    int nc1=s1.charAt(i+1);
                    int ci=(ac=='1')?0:1;
                    int cn=(nc1=='1')?0:1;
                    int oc=ci+cn+1;
                    if(c2=='1'){
                        oc += 1;
                    }
                    if(nc1=='1'){
                        nd1=Math.min(nd1,cc+oc);
                    }
                    else{
                        nd0=Math.min(nd0,cc+oc);
                    }
                }
            }
            d0=nd0;
            d1=nd1;
        }
        return d0>=inf?-1:d0;
    }
}