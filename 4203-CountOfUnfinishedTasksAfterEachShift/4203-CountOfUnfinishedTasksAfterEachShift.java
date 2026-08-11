// Last updated: 11/08/2026, 15:59:42
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n=tasks.length;
        int m=shifts.length;
        long[]p=new long[n+1];
        for(int i=0;i<n;i++){
            p[i+1]=p[i]+tasks[i];
        }
        long ttt=p[n];
        int []a=new int[m];
        long ct=0;
        for(int j=0;j<m;j++){
            long shift=shifts[j];
            long t=ct+shift;
            if(t>=ttt){
                a[j]=0;
                ct=0;
            }
            else{
                int cc=binary(p,t);
                a[j]=n-cc;
                ct=t;
            }
        }
        return a;
    }
    private int binary(long[]p,long t){
        int l=0,h=p.length-1;
        int a=0;
        while(l<=h){
            int mid=(l+h)>>1;
            if(p[mid]<=t){
                a=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        return a;
    }
}