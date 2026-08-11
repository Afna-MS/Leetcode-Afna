// Last updated: 11/08/2026, 15:59:45
class Solution {
    public int divisibleGame(int[] nums) {
        long mod=1000000007L;
        int n=nums.length;
        int maxv=0;
        int maxneg=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>maxv) maxv=num;
            if(-num>maxneg) maxneg=-num;
        }
        long[]pre=new long[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        Map<Integer,List<Integer>>mx=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            int d=2;
            while(d*d <= num){
                if(num%d==0){
                    mx.computeIfAbsent(d,k->new ArrayList<>()).add(i);
                    if(d*d!=num){
                        mx.computeIfAbsent(num/d,k->new ArrayList<>()).add(i);
                    }
                }
                d++;
            }
            if(num>1){
                mx.computeIfAbsent(num,k-> new ArrayList<>()).add(i);
            }
        }
        long maxs=maxneg;
        int b=2;
        for(int k=2;k<=maxv+1;k++){
            long s;
            if(!mx.containsKey(k)){
                s=maxneg;
            }
            else{
                List<Integer>idx=mx.get(k);
                long cm=nums[idx.get(0)];
                s=cm;
                for(int j=1;j<idx.size();j++){
                    int pdx=idx.get(j-1);
                    int cdx=idx.get(j);
                    long g=-(pre[cdx]-pre[pdx+1]);
                    cm=Math.max((long) nums[cdx],cm+g+nums[cdx]);
                    s=Math.max(s,cm);
                }
                s=Math.max(s,maxneg);
            }
            if(s>maxs){
                maxs=s;
                b=k;
            }
            else if(s==maxs){
                b=Math.min(b,k);
            }
        }
        long res=(maxs%mod)*(b%mod);
        res=(res%mod+mod)%mod;
        return (int)res;
    }
}