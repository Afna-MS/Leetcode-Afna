// Last updated: 11/08/2026, 15:59:34
class Solution {
    int k;
    Long[][][][]dp;
    char[]digits;
    public long goodIntegers(long l, long r, int k) {
        this.k=k;
        return solve(r)-solve(l-1);
    }
    private long solve(long x){
        if(x<0) return 0;
        digits=String.valueOf(x).toCharArray();
        int n=digits.length;
        dp=new Long[digits.length][11][2][2];
        return dfs(0,10,1,0);
    }
    private long dfs(int pos,int prev,int t,int s){
        if(pos==digits.length){
            return 1;
        }
        if(dp[pos][prev][t][s]!=null){
            return dp[pos][prev][t][s];
        }
        int lim=t==1?digits[pos]-'0':9;
        long ans=0;
        for(int d=0;d<=lim;d++){
            int nt=(t==1 && d==lim)?1:0;
            if(s==0 && d==0){
                ans += dfs(pos +1,10,nt,0);
            }
            else{
                if(prev==10||Math.abs(prev-d)<=k){
                    ans += dfs(pos+1,d,nt,1);
                }
            }
        }
        return dp[pos][prev][t][s]=ans;
    }
}