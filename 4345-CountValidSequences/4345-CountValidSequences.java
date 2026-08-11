// Last updated: 11/08/2026, 15:59:05
class Solution {
    private static final int mod=1_000_000_007;
    public int countValidSequences(int n, int k) {
        if(n<k) return 0;
        long tw=nCr (n-1,k-1);
        long ow=0;
        if((n-k)%2==0){
            int s=(n-k)/2;
            ow=nCr(s+k-1,k-1);
        }
        long res=(tw-ow+mod)%mod;
        return (int)res;
    }
    private long nCr(int n,int r){
        if(r<0||r>n) return 0;
        if(r==0||r==n) return 1;
        if(r>n/2) r=n-r;
        long num=1;
        long den=1;
        for(int i=1;i<=r;i++){
            num=(num*(n-i+1))%mod;
            den=(den*i)%mod;
        }
        return (num*modin(den,mod))%mod;
    }
    private long modin(long a,int m){
        return power(a,m-2,m);
    }
    private long power(long x,long y,int m){
        long res=1;
        x=x%m;
        while(y>0){
            if((y&1)==1){
                res=(res*x)%mod;
            }
            y=y>>1;
            x=(x*x)%m;
        }
        return res;
    }
}